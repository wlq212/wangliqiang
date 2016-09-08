package com.px.web.train;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Train;
import com.px.service.TrainService;
import com.px.service.Impl.TrainServiceImpl;

/**
 * Servlet implementation class selectTrainServlet
 */
@WebServlet("/selectTrainServlet2")
public class selectTrainServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectTrainServlet2() {
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
		String name = new String(request.getParameter("sname").getBytes("ISO-8859-1"),"UTF-8");
		TrainService trainService = new TrainServiceImpl();
		List<Train> trains = trainService.selectTrainByName(name);
		if(trains!=null){
			request.setAttribute("trains", trains);
			request.getRequestDispatcher("Train2.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该培训记录不存在");
			request.getRequestDispatcher("listTrainServlet").forward(request, response);
		}
	}

}
