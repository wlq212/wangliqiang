package com.px.web.use;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Use;
import com.px.service.UseService;
import com.px.service.Impl.UseServiceImpl;

/**
 * Servlet implementation class selectUseServlet
 */
@WebServlet("/selectUseServlet1")
public class selectUseServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectUseServlet1() {
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
		int uno = Integer.parseInt(request.getParameter("uno"));
		UseService useService = new UseServiceImpl();
		List<Use> uses = useService.selectUseByUno(uno);
		if(uses!=null){
			request.setAttribute("uses", uses);
			request.getRequestDispatcher("Use.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该用户不存在");
			request.getRequestDispatcher("listUseServlet").forward(request, response);
		}
	}

}
