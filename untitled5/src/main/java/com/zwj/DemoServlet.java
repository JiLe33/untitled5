package com.zwj;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
@WebServlet(name = "demoServlet",urlPatterns = {"/getParameter"})
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getMethod());
//        System.out.println(req.getRequestURI());
//        System.out.println(req.getContextPath());
//        Enumeration<String>headerNames=req.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//                String k=headerNames.nextElement();
//                System.out.println("key"+k);
//            System.out.println("value"+req.getHeader(k));
//        }
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        String age=req.getParameter("age");
        System.out.println("name"+name+";password"+password+";age"+age);


    }
}
