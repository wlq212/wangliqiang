package com.px.web.train;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Train;
import com.px.service.TrainService;
import com.px.service.Impl.TrainServiceImpl;

/**
 * Servlet implementation class addTrainServlet
 */
@WebServlet("/addTrainServlet")
public class addTrainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTrainServlet() {
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
		int tno = Integer.parseInt(request.getParameter("tno"));
		String content = request.getParameter("content");
		String time = request.getParameter("time");
		int sno = Integer.parseInt(request.getParameter("sno"));
		String name = request.getParameter("name");
		String behave = request.getParameter("behave");
		Train train = new Train(tno, content, time, sno, name, behave);
		TrainService trainService = new TrainServiceImpl();
		int num = trainService.addTrain(train);
		if(num!=0){
			request.getRequestDispatcher("listTrainServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该培训编号已存在或员工不存在");
			request.getRequestDispatcher("Train1.jsp").forward(request, response);
			
		}

	}

}
