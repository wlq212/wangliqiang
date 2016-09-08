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
 * Servlet implementation class selectDebtServlet
 */
@WebServlet("/selectDebtServlet1")
public class selectDebtServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectDebtServlet1() {
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
		List<Debt> debts = debtService.selectDebtByDno(dno);
		if(debts!=null){
			request.setAttribute("debts", debts);
			request.getRequestDispatcher("Debt.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该账单记录不存在");
			request.getRequestDispatcher("listDebtServlet").forward(request, response);
		}
	}

}
