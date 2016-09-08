package com.px.web.building;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Building;
import com.px.service.BuildingService;
import com.px.service.Impl.BuildingServiceImpl;

/**
 * Servlet implementation class listBuildingServlet
 */
@WebServlet("/listBuildingServlet1")
public class listBuildingServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listBuildingServlet1() {
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
		BuildingService buildingService = new BuildingServiceImpl();
		List<Building> buildings = buildingService.listAllBuilding();
		request.setAttribute("buildings", buildings);
		request.getRequestDispatcher("Buildingtab2.jsp").forward(request, response);
	}

}
