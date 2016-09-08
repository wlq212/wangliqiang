package com.px.web.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Manager;
import com.px.bean.Stuff;
import com.px.bean.Use;
import com.px.service.ManagerService;
import com.px.service.StuffService;
import com.px.service.UseService;
import com.px.service.Impl.ManagerServiceImpl;
import com.px.service.Impl.StuffServiceImpl;
import com.px.service.Impl.UseServiceImpl;

/**
 * Servlet implementation class loginServelt
 */
@WebServlet("/loginServlet")
public class loginServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public loginServelt() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		UseService useservice = new UseServiceImpl();
		Use use = useservice.getUse(name, password);
		StuffService stuffService = new StuffServiceImpl();
		Stuff stuff = stuffService.getStuff(name, password);
		ManagerService managerService = new ManagerServiceImpl();
		Manager manager = managerService.getManager(name, password);
		if(use!=null){
				request.getSession().setAttribute("use", use);
				request.getRequestDispatcher("/mian.jsp").forward(request, response);
		}else if(stuff!=null){
			request.getSession().setAttribute("stuff", stuff);
			request.getRequestDispatcher("/main2.jsp").forward(request, response);
		}else if(manager!=null){
			request.getSession().setAttribute("manager", manager);
			request.getRequestDispatcher("/mian.jsp").forward(request, response);
		}else {
			request.setAttribute("error", "用户名不存在或密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

}
