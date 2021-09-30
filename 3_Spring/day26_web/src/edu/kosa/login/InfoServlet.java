package edu.kosa.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	public String uname = "아순신";
	public String uage = "30";
	public String ulocal = "전국";
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String local = request.getParameter("local");
		response.setCharacterEncoding("euc-kr");
		System.out.println(name + ", " + age + ", " + local);
		PrintWriter pw = response.getWriter();

		if (uname.equals(name) && !uage.equals(age) && ulocal.equals(local)) {
			pw.write("pwd fail");
			pw.println("<a href='html/info.html'>Login</a>");
		} else if (uname.equals(name) && uage.equals(age) && !ulocal.equals(local)) {
			pw.write("pwd fail");
			pw.println("<a href='html/info.html'>Login</a>");
		} else if (uname.equals(name) && uage.equals(age) && ulocal.equals(local)) {
			pw.write("<h1>index page에서 servlet 불렀습니다.</h1>");
			pw.write(name + age + local);
		}else {
			pw.write("register fail<br>");
			pw.write("<h1>다시 입력하려면 <b><a href='./index.html'>여기</a></b>.</h1>");
		}

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
