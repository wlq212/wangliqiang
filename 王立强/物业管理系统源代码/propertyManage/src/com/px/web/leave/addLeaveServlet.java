package com.px.web.leave;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Leave;
import com.px.service.LeaveService;
import com.px.service.Impl.LeaveServiceImpl;

/**
 * Servlet implementation class addLeaveServlet
 */
@WebServlet("/addLeaveServlet")
public class addLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addLeaveServlet() {
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
		int lno = Integer.parseInt(request.getParameter("lno"));
		String reason = request.getParameter("reason");
		String time = request.getParameter("time");
		int sno = Integer.parseInt(request.getParameter("sno"));
		String name = request.getParameter("name");
		Leave leave = new Leave(lno, reason, time, sno, name);
		LeaveService leaveService = new LeaveServiceImpl();
		int num = leaveService.addLeave(leave);
		if(num!=0){
			request.getRequestDispatcher("listLeaveServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该离职编号已存在或该员工不存在");
			request.getRequestDispatcher("Leave1.jsp").forward(request, response);
			
		}

	}

}
