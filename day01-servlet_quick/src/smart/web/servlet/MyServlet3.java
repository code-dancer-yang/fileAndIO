package smart.web.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyHttpServlet3")
public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =new String(request.getParameter("username").getBytes("ISO-8859-1"),"utf-8");//解决get请求乱码
		String password =new String( request.getParameter("password").getBytes("iso-8859-1"),"utf-8");		
//		String username =request.getParameter("username");
//		String password = request.getParameter("password");	
		String[] hobby = request.getParameterValues("hobby");
		System.out.println(username);
		System.out.println(password);
		for (String string : hobby) {
			System.out.println(new String(string.getBytes("iso-8859-1"),"utf-8"));
		}
		System.out.println("**************************************");
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String name=parameterNames.nextElement();
			String[] values=request.getParameterValues(name);
			for (String string : values) {
				System.out.println(new String(string.getBytes("ISO-8859-1"), "UTF-8"));
			}
			System.out.println("-------------------------------");
		}
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(",请求方式："+request.getMethod());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//解决post请求乱码
		String username =request.getParameter("username");
		String password = request.getParameter("password");		
		String[] hobby = request.getParameterValues("hobby");
		System.out.println(username);
		System.out.println(password);
		for (String string : hobby) {
			System.out.println(string);
		}
		System.out.println("**************************************");
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String name=parameterNames.nextElement();
			String[] values=request.getParameterValues(name);
			for (String string : values) {
				System.out.println(string);
			}
			System.out.println("-------------------------------");
		}
		response.setContentType("text/html;charset=utf-8");//解决响应中文乱码
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(",请求方式："+request.getMethod());
	}

}
