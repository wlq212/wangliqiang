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
@WebServlet("/selectLeaveServlet")
public class selectLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectLeaveServlet() {
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
		LeaveService leaveService = new LeaveServiceImpl();
		List<Leave> leaves = leaveService.selectLeaveByLno(lno);
		if(leaves!=null){
			request.setAttribute("leaves", leaves);
			request.getRequestDispatcher("Leavetab.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该培训记录不存在");
			request.getRequestDispatcher("listLeaveServlet").forward(request, response);
		}
	}

}
