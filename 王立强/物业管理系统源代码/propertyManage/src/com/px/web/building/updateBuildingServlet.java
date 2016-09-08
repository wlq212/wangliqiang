package com.px.web.building;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Building;
import com.px.service.BuildingService;
import com.px.service.Impl.BuildingServiceImpl;

/**
 * Servlet implementation class updateBuildingServlet
 */
@WebServlet("/updateBuildingServlet")
public class updateBuildingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateBuildingServlet() {
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
		int uno = Integer.parseInt(request.getParameter("uno"));
		String admini = request.getParameter("admini");
		int num = Integer.parseInt(request.getParameter("num"));
		int bno = Integer.parseInt(request.getParameter("bno"));
		BuildingService buildingService = new BuildingServiceImpl();
		Building building = new Building(uno, admini, num, bno);
		int a = buildingService.updateBuilding(building);
		if(a!=0){
			request.getRequestDispatcher("listBuildingServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该楼栋记录已存在");
			request.getRequestDispatcher("listBuildingServlet").forward(request, response);
			
		}
	}

}
