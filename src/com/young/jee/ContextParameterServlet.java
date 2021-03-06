package com.young.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( name="contextParameterServlet",urlPatterns= {"/contextParameter"} )

public class ContextParameterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		PrintWriter writer = resp.getWriter();
		writer.append("settingONe:").append(context.getInitParameter("settingOne"))
				.append(", settingTwo:").append(context.getInitParameter("settingTwo"));
	}
}
