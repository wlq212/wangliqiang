package com.px.web.repair;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Repair;
import com.px.service.RepairService;
import com.px.service.Impl.RepairServiceImpl;

/**
 * Servlet implementation class addRepairServelet
 */
@WebServlet("/addRepairServlet")
public class addRepairServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addRepairServelet() {
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
		int rpno = Integer.parseInt(request.getParameter("rpno"));
		int rno = Integer.parseInt(request.getParameter("rno"));
		String content = request.getParameter("content");
		int price = Integer.parseInt(request.getParameter("price"));
		String time = request.getParameter("time");
		Repair repair = new Repair(rpno, rno, content, price, time);
		RepairService repairService = new RepairServiceImpl();
		int num = repairService.addRepair(repair);
		if(num!=0){
			request.getRequestDispatcher("listRepairServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该维修单号已存在或该房间不存在");
			request.getRequestDispatcher("Repair1.jsp").forward(request, response);
			
		}

		
	}

}
