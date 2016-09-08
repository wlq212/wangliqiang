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
 * Servlet implementation class addBuildingServlet
 */
@WebServlet("/addBuildingServlet")
public class addBuildingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBuildingServlet() {
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
		int bno = Integer.parseInt(request.getParameter("bno"));
		String name = request.getParameter("name");
		String style = request.getParameter("style");
		int height = Integer.parseInt(request.getParameter("height"));
		int uno = Integer.parseInt(request.getParameter("uno"));
		String admini = request.getParameter("admini");
		int num = Integer.parseInt(request.getParameter("num"));
		int vno = Integer.parseInt(request.getParameter("vno"));
		String namee = request.getParameter("namee");
		Building building = new Building(bno, name, style, height, uno, admini, num, vno, namee);
		BuildingService buildingService = new BuildingServiceImpl();
		int a = buildingService.addBuilding(building);
		if(a!=0){
			request.getRequestDispatcher("listBuildingServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该楼栋号已存在或该小区，管理员不存在");
			request.getRequestDispatcher("Building1.jsp").forward(request, response);
			
		}
	}

}
