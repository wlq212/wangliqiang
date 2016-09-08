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
 * Servlet implementation class selectBuildingServlet
 */
@WebServlet("/selectBuildingServlet")
public class selectBuildingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectBuildingServlet() {
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
		int bno = Integer.parseInt(request.getParameter("bno"));
		BuildingService buildingService = new BuildingServiceImpl();
		List<Building> buildings = buildingService.selectBuildingByBno(bno);
		if(buildings!=null){
			request.setAttribute("buildings", buildings);
			request.getRequestDispatcher("Buildingtab.jsp").forward(request, response);
		}
		else{
			request.setAttribute("error", "该楼栋记录不存在");
			request.getRequestDispatcher("listBuildingServlet").forward(request, response);
			
		}
	}

}
