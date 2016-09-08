package com.px.web.room;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.service.RoomService;
import com.px.service.Impl.RoomServiceImpl;

/**
 * Servlet implementation class deleteRoomServlet
 */
@WebServlet("/deleteRoomServlet")
public class deleteRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		int rno = Integer.parseInt(request.getParameter("rno"));
		RoomService roomService  = new RoomServiceImpl();
		int num = roomService.deleteByRno(rno);
		if(num!=0){
			request.getRequestDispatcher("listRoomServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该房间记录不存在");
			request.getRequestDispatcher("listRoomServlet").forward(request, response);
			
		}
	}

}
