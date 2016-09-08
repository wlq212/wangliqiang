package com.px.web.village;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Village;
import com.px.service.VillageService;
import com.px.service.Impl.VillageServiceImpl;

/**
 * Servlet implementation class listVillageServlet
 */
@WebServlet("/listVillageServlet1")
public class listVillageServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listVillageServlet1() {
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
		VillageService villageService = new VillageServiceImpl();
		List<Village> villages = villageService.listAllVillage();
		request.setAttribute("villages", villages);
		request.getRequestDispatcher("Villagetab2.jsp").forward(request, response);
	}

}
