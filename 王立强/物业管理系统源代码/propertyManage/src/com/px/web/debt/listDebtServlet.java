package com.px.web.debt;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Debt;
import com.px.service.DebtService;
import com.px.service.Impl.DebtServiceImpl;

/**
 * Servlet implementation class listDebtServlet
 */
@WebServlet("/listDebtServlet")
public class listDebtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listDebtServlet() {
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
		DebtService debtService = new DebtServiceImpl();
		List<Debt> debts = debtService.listAllDebt();
		request.setAttribute("debts", debts);
		request.getRequestDispatcher("Debttab.jsp").forward(request, response);
	}

}
