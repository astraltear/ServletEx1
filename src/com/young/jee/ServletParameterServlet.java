package com.young.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletParameterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletConfig config = this.getServletConfig();
		PrintWriter writer = resp.getWriter();
		
		writer.append("database:").append(config.getInitParameter("database"))
			  .append(", server:").append(config.getInitParameter("server"));
	}
}
