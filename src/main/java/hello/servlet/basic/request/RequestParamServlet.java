package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1. 파라미터 전송 기능
 * http://localhost:8080/request-param?username=hello&age=20
 */
@WebServlet(name="requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("[전체 파라미터 조회] - start");
        request.getParameterNames().asIterator().forEachRemaining(paramName -> System.out.println(paramName+"="+request.getParameter(paramName)));

        System.out.println("[전체 파라미터 조회] - end");
        System.out.println();

        System.out.println("[단일 파라미터 조회] - start");
        String userName = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("userName = " + userName);
        System.out.println("age = " + age);
        System.out.println();

        //?username=hello&age=20&username=hello2
        System.out.println("[이름이 같은 복수 파라미터 조회]");
        String[] usernames = request.getParameterValues("username"); // 중복
        for (String username : usernames) {
            System.out.println("username = " + username);
        }
        System.out.println();
        response.getWriter().write("OK");

        /**
         * request.getParameter를 이용하면 GET, POST 메소드 모든 파라미터 받을 수 있다.
         * POST 메시지 바디에 username=kim&age=20 이런식으로 쿼리파라미터 형식으로 보내주기 때문
         *
         */

    }
}
