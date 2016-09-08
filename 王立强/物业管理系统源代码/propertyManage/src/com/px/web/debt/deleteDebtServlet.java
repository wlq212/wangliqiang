package com.px.web.debt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.service.DebtService;
import com.px.service.Impl.DebtServiceImpl;

/**
 * Servlet implementation class deleteDebtServlet
 */
@WebServlet("/deleteDebtServlet")
public class deleteDebtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteDebtServlet() {
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
		int dno = Integer.parseInt(request.getParameter("dno"));
		DebtService debtService = new DebtServiceImpl();
		int num = debtService.deleteByDno(dno);
		if(num!=0){
			request.getRequestDispatcher("listDebtServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该购欠费记录不存在");
			request.getRequestDispatcher("listDebtServlet").forward(request, response);
			
		}
	}

}
