package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Question;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet("/init.do")
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Question> questions = new ArrayList<>();
		questions.add(new Question(1, "question 1", "optionA", "optionB", "optionC", "optionD", 'a'));
		questions.add(new Question(1, "question 2", "optionA", "optionB", "optionC", "optionD", 'b'));
		questions.add(new Question(1, "question 3", "optionA", "optionB", "optionC", "optionD", 'c'));
		questions.add(new Question(1, "question 4", "optionA", "optionB", "optionC", "optionD", 'd'));

		request.getSession().setAttribute("questions", questions);
		request.getSession().setAttribute("startIndex", 0);
		request.getSession().setAttribute("endIndex", questions.size() - 1);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
