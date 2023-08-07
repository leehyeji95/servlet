package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = "+username);

        // HTTP Response ContentType(header) 에 들어감
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8"); // 요즘 대부분 utf-8, EUC-KR 안씀

        // HTTP 메시지 Body 에 데이터가 들어감
        response.getWriter().write("hello "+username);
    }
}
