package com.px.web.use;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Use;
import com.px.service.UseService;
import com.px.service.Impl.UseServiceImpl;

/**
 * Servlet implementation class updateUseServlet
 */
@WebServlet("/updateUseServlet")
public class updateUseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateUseServlet() {
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
		String carid = request.getParameter("carid");
		String pet = request.getParameter("pet");
        long phone = Long.parseLong(request.getParameter("phone"));
		int uno = Integer.parseInt(request.getParameter("uno"));
		Use use = new Use(carid, pet, phone, uno);
		UseService useService = new UseServiceImpl();
		int num = useService.updateUse(use);
		if(num!=0){
			request.getRequestDispatcher("listUseServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该用户不存在");
			request.getRequestDispatcher("listUseServlet").forward(request, response);
			
		}
	}

}
