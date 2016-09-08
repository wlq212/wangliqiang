package com.px.web.village;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Village;
import com.px.service.VillageService;
import com.px.service.Impl.VillageServiceImpl;

/**
 * Servlet implementation class updateVillageServlet
 */
@WebServlet("/updateVillageServlet")
public class updateVillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateVillageServlet() {
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
		String introduce = request.getParameter("introduce");
		int sno = Integer.parseInt(request.getParameter("sno"));
		String admini = request.getParameter("admini");
		int vno = Integer.parseInt(request.getParameter("vno"));
		VillageService villageService = new VillageServiceImpl();
		Village village = new Village(introduce, sno, admini, vno);
		int a = villageService.updateVillage(village);
		if(a!=0){
			request.getRequestDispatcher("listVillageServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该管理员工不存在");
			request.getRequestDispatcher("listVillageServlet").forward(request, response);
			
		}
	}

}
