package com.px.web.room;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Room;
import com.px.service.RoomService;
import com.px.service.Impl.RoomServiceImpl;

/**
 * Servlet implementation class listRoomServlet
 */
@WebServlet("/listRoomServlet")
public class listRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listRoomServlet() {
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
		RoomService roomService  = new RoomServiceImpl();
		List<Room> rooms = roomService.listAllRoom();
		request.setAttribute("rooms", rooms);
		request.getRequestDispatcher("Roomtab.jsp").forward(request, response);
	}

}
