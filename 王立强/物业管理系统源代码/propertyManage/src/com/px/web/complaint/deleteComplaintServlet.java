package com.px.web.complaint;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.service.ComplaintService;
import com.px.service.Impl.ComplaintServiceImpl;

/**
 * Servlet implementation class deleteComplaintServlet
 */
@WebServlet("/deleteComplaintServlet")
public class deleteComplaintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteComplaintServlet() {
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
		ComplaintService complaintService = new ComplaintServiceImpl();
		int num = complaintService.deleteByCono(cono);
		if(num!=0){
			request.getRequestDispatcher("listComplaintServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该投诉记录不存在");
			request.getRequestDispatcher("listComplaintServlet").forward(request, response);
			
		}
	}

}
