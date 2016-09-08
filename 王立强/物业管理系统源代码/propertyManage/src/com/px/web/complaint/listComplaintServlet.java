package com.px.web.complaint;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Complaint;
import com.px.service.ComplaintService;
import com.px.service.Impl.ComplaintServiceImpl;

/**
 * Servlet implementation class listComplaintServlet
 */
@WebServlet("/listComplaintServlet")
public class listComplaintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listComplaintServlet() {
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
		ComplaintService complaintService = new ComplaintServiceImpl();
		List<Complaint> complaints = complaintService.listAllComplaint();
		request.setAttribute("complaints", complaints);
		request.getRequestDispatcher("Complaintab.jsp").forward(request, response);
	}

}
