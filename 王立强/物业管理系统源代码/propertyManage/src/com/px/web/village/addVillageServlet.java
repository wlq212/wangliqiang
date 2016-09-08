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
 * Servlet implementation class addVillageServlet
 */
@WebServlet("/addVillageServlet")
public class addVillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addVillageServlet() {
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
		int vno = Integer.parseInt(request.getParameter("vno"));
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		int sno = Integer.parseInt(request.getParameter("sno"));
		String admini = request.getParameter("admini");
		int num = Integer.parseInt(request.getParameter("num"));
		Village village = new Village(vno, name, introduce, sno, admini, num);
		VillageService villageService = new VillageServiceImpl();
		int a = villageService.addVillage(village);
		if(a!=0){
			request.getRequestDispatcher("listVillageServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该小区编号已存在或该管理员不存在");
			request.getRequestDispatcher("Village1.jsp").forward(request, response);
			
		}
	}

}
