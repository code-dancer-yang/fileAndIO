package logindemo.ismart.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录请求的处理类
 * @author zhyang
 *
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	/**
	 * 请求处理的方法
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求的编码方式
		request.setCharacterEncoding("utf-8");
		//设置响应的类型
		response.setCharacterEncoding("text/html;charset=utf-8");
		//获取请求表单的参数信息
		String checkCode=request.getParameter("checkCode");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//获取session中保存的生成的验证码信息
		String checkCode_session=(String) request.getSession().getAttribute("checkCode_session");
		if(checkCode!=null&&checkCode_session!=null&&checkCode.equalsIgnoreCase(checkCode_session)) {
			//验证码正确，判断用户名和密码的正确性
			if(username!=null&&password!=null&&username.equals("zhangsan")&&password.equals("123456")) {
				//用户信息匹配，重定向到成功界面
				request.getSession().setAttribute("username",username);
				request.getSession().setMaxInactiveInterval(15);
				response.sendRedirect(request.getContextPath()+"/success.jsp");
			}else {
				//用户信息不匹配，请求转发到登录界面，并提示信息
				request.setAttribute("msg_user","用户名或密码错误！请重新键入");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			
		}else {
			//验证码错误，请求转发到登录页面，并提示验证码错误
			request.setAttribute("msg_checkCode","验证码错误！请重新输入");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}




	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
