package com.px.web.complaint;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Complaint;
import com.px.service.ComplaintService;
import com.px.service.Impl.ComplaintServiceImpl;

/**
 * Servlet implementation class addComplaintServlet
 */
@WebServlet("/addComplaintServlet")
public class addComplaintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addComplaintServlet() {
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
		int cono = Integer.parseInt(request.getParameter("cono"));
		int uno = Integer.parseInt(request.getParameter("uno"));
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		String time = request.getParameter("time");
		Complaint complaint = new Complaint(cono, uno, name, content, time);
		ComplaintService complaintService = new ComplaintServiceImpl();
		int num = complaintService.addComplaint(complaint);
		if(num!=0){
			request.getRequestDispatcher("listComplaintServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该投诉单号已存在或该客户不存在");
			request.getRequestDispatcher("Complaint1.jsp").forward(request, response);
			
		}
	}

}
