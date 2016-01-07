package com.young.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/gsonTest")
public class GsonServlet extends HttpServlet{

//	http://localhost:8180/ServletProj/gsonTest
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDTO userDTO = new UserDTO("astral", "tear", "darap");
		
		final GsonBuilder builder = new GsonBuilder();
		builder.excludeFieldsWithoutExposeAnnotation();
		final Gson gson = builder.create();
		String jsonData = gson.toJson(userDTO);
		
//		resp.setContentType("application/json;charset=UTF-8");
		
		
		PrintWriter out = resp.getWriter();
		out.print(jsonData);
		
	}
}
