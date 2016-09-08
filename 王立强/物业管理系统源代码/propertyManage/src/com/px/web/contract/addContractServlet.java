package com.px.web.contract;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Contract;
import com.px.service.ContractService;
import com.px.service.Impl.ContractServiceImpl;

/**
 * Servlet implementation class addContractServlet
 */
@WebServlet("/addContractServlet")
public class addContractServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addContractServlet() {
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
		int cno = Integer.parseInt(request.getParameter("cno"));
		String content = request.getParameter("content");
		String begintime = request.getParameter("begintime");
		int time = Integer.parseInt(request.getParameter("time"));
		int sno = Integer.parseInt(request.getParameter("sno"));
		String name = request.getParameter("name");
		Contract contract = new Contract(cno, content, begintime, time, sno, name);
		ContractService contractService = new ContractServiceImpl();
		int num = contractService.addContract(contract);
		if(num!=0){
			request.getRequestDispatcher("listContractServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该合同编号已存在或该员工不存在");
			request.getRequestDispatcher("Contract1.jsp").forward(request, response);
			
		}

	}

}
