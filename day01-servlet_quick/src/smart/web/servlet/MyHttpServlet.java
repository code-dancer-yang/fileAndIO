package smart.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHttpServlet
 */
@WebServlet("/MyHttpServlet")
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHttpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method = request.getMethod();
		String contextPath = request.getContextPath();//项目的虚拟目录
		String servletPath = request.getServletPath();//请求的servlet路径
		String requestURI = request.getRequestURI();//uri
		StringBuffer requestURL = request.getRequestURL();//url
		String protocol = request.getProtocol();//请求的协议
		String remoteAddr = request.getRemoteAddr();//发送请求的主机IP
		int localPort = request.getLocalPort();
		int remotePort = request.getRemotePort();
		String queryString = request.getQueryString();
		System.out.println("method:"+method);
		System.out.println("contextPath:"+contextPath);
		System.out.println("requestURI:"+requestURI);
		System.out.println("requestURL:"+requestURL);
		System.out.println("servletPath:"+servletPath);
		System.out.println("protocol:"+protocol);
		System.out.println("remoteAddr:"+remoteAddr);
		System.out.println("localPort:"+localPort);
		System.out.println("remotePort:"+remotePort);
		System.out.println("queryString:"+queryString);
		System.out.println("++++++++++++++++++++++");
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName=headerNames.nextElement();
			System.out.println(headerName+":"+request.getHeader(headerName));
		}
		System.out.println("this is a "+method+"请求");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("this is a "+request.getMethod()+"请求");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
