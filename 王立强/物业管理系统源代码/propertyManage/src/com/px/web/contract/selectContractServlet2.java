package com.px.web.contract;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Contract;
import com.px.service.ContractService;
import com.px.service.Impl.ContractServiceImpl;

/**
 * Servlet implementation class selectContractServlet
 */
@WebServlet("/selectContractServlet2")
public class selectContractServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectContractServlet2() {
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
		ContractService contractService = new ContractServiceImpl();
		List<Contract> contracts = contractService.selectContractByName(name);
		if(contracts!=null){
			request.setAttribute("contracts", contracts);
			request.getRequestDispatcher("Contract2.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该合同不存在");
			request.getRequestDispatcher("listContractServlet").forward(request, response);
		}
	}
	}