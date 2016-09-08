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
 * Servlet implementation class updateTrainServlet
 */
@WebServlet("/updateTrainServlet")
public class updateTrainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateTrainServlet() {
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
		String content = request.getParameter("content");
		String time = request.getParameter("time");
		String behave = request.getParameter("behave");
		int tno = Integer.parseInt(request.getParameter("tno"));
		TrainService trainService = new TrainServiceImpl();
		Train train = new Train(content, time, behave, tno);
		int num = trainService.updateTrain(train);
		if(num!=0){
			request.getRequestDispatcher("listTrainServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该培训记录已存在");
			request.getRequestDispatcher("listTrainServlet").forward(request, response);
			
		}
	}

}
