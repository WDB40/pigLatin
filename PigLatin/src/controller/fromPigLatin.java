package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PigLatinWord;

/**
 * Servlet implementation class fromPigLatin
 */
@WebServlet("/fromPigLatin")
public class fromPigLatin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fromPigLatin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userWord = request.getParameter("fromWord");
		PigLatinWord pigLatinWord = new PigLatinWord(userWord);
		
		request.setAttribute("toWord", pigLatinWord);
		
		getServletContext()
			.getRequestDispatcher("/fromPigLatin.jsp")
			.forward(request, response);
		
	}

}
