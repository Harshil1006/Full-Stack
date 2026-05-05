package com.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

import com.bean.User;
import com.dao.UserDao;

@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		System.out.println("Filter Destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		boolean flag=UserDao.checkEmail(request.getParameter("email"));
		if(flag==false)
		{
			if(request.getParameter("password").equals(request.getParameter("cpassword")))
			{
				chain.doFilter(request, response);
			}
			else
			{
				request.setAttribute("msg", "Password & Confirm Password Does Not Matched");
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}
		}
		else
		{
			User u=new User();
			u.setFname(request.getParameter("fname"));
			u.setEmail(request.getParameter("email"));
			request.setAttribute("u", u);
			request.setAttribute("msg", "Email Already Resgistered");
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}

}
