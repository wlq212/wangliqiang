package com.px.web.leave;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Leave;
import com.px.service.LeaveService;
import com.px.service.Impl.LeaveServiceImpl;

/**
 * Servlet implementation class selectLeaveServlet
 */
@WebServlet("/selectLeaveServlet2")
public class selectLeaveServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectLeaveServlet2() {
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
		String name = new String(request.getParameter("sname").getBytes("ISO-8859-1"),"UTF-8");
		LeaveService leaveService = new LeaveServiceImpl();
		List<Leave> leaves = leaveService.selectLeaveByName(name);
		if(leaves!=null){
			request.setAttribute("leaves", leaves);
			request.getRequestDispatcher("Leave2.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该培训记录不存在");
			request.getRequestDispatcher("listLeaveServlet").forward(request, response);
		}
	}

}
