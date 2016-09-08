package com.px.web.room;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Room;
import com.px.service.RoomService;
import com.px.service.Impl.RoomServiceImpl;

/**
 * Servlet implementation class addRoomServlet
 */
@WebServlet("/addRoomServlet")
public class addRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addRoomServlet() {
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
		request.setCharacterEncoding("UTF-8");
		int rno = Integer.parseInt(request.getParameter("rno"));
		String facility = request.getParameter("facility");
		int area = Integer.parseInt(request.getParameter("area"));
		int uno = Integer.parseInt(request.getParameter("uno"));
		String name = request.getParameter("name");
		int vno = Integer.parseInt(request.getParameter("vno"));
		String namee = request.getParameter("namee");
		int bno = Integer.parseInt(request.getParameter("bno"));
		String nname = request.getParameter("nname");
		String live = request.getParameter("live");
		Room room = new Room(rno, facility, area, uno, name, vno, namee, bno, nname, live);
		RoomService roomService  = new RoomServiceImpl();
		int num = roomService.addRoom(room);
		if(num!=0){
			request.getRequestDispatcher("listRoomServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该房间已存在或楼栋，小区不存在");
			request.getRequestDispatcher("Room1.jsp").forward(request, response);
			
		}
		
	}

}
