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
@WebServlet("/selectContractServlet1")
public class selectContractServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectContractServlet1() {
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
		ContractService contractService = new ContractServiceImpl();
		List<Contract> contracts = contractService.selectContractBycno(cno);
		if(contracts!=null){
			request.setAttribute("contracts", contracts);
			request.getRequestDispatcher("Contract.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该合同不存在");
			request.getRequestDispatcher("listContractServlet").forward(request, response);
		}
	}
	}

