package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//处理中文字符串乱码问题
		request.setCharacterEncoding("utf-8");
		User u = new User();
		//接收表单提交信息
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		u.setUserName(userName);
		u.setPassWord(passWord);
		if(u.getUserName().equals("admin")&&u.getPassWord().equals("admin")){
			//设置session变量，在不同web页面之间传递变量
			request.getSession().setAttribute("loginUser",u);
			//站内页面跳转
			request.getRequestDispatcher("../login_success.jsp").forward(request,response);
		}else{
			request.getRequestDispatcher("../login_failure.jsp").forward(request, response);
		}
	}

}
