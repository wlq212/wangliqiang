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
 * Servlet implementation class updateLeaveServlet
 */
@WebServlet("/updateLeaveServlet")
public class updateLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateLeaveServlet() {
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
		String reason = request.getParameter("reason");
		String time = request.getParameter("time");
		int lno = Integer.parseInt(request.getParameter("lno"));
		LeaveService leaveService = new LeaveServiceImpl();
		Leave leave = new Leave(reason, time, lno);
		int num = leaveService.updateLeave(leave);
		if(num!=0){
			request.getRequestDispatcher("listLeaveServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该离职记录不存在");
			request.getRequestDispatcher("listLeaveServlet").forward(request, response);
			
		}
	}

}
