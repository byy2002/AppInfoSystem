package cn.ys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/login")
public class HouController {
    @PostMapping("/l")
  public void deng(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
    }
}
