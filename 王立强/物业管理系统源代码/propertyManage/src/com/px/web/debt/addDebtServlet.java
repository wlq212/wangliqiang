package com.px.web.debt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Debt;
import com.px.service.DebtService;
import com.px.service.Impl.DebtServiceImpl;

/**
 * Servlet implementation class addDebtServlet
 */
@WebServlet("/addDebtServlet")
public class addDebtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addDebtServlet() {
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
		int rno = Integer.parseInt(request.getParameter("rno"));
		int price = Integer.parseInt(request.getParameter("price"));
		String time = request.getParameter("time");
		String pay = request.getParameter("pay");
		Debt debt = new Debt(dno, rno, price, time, pay);
		DebtService debtService = new DebtServiceImpl();
		int num = debtService.addDebt(debt);
		if(num!=0){
			request.getRequestDispatcher("listDebtServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该购欠费单号已存在或该房间不存在");
			request.getRequestDispatcher("Debt1.jsp").forward(request, response);
			
		}
		
	}

}
