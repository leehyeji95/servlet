package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String viewPath = "/WEB-INF/views/new-form.jsp";
        // WEB-INF/ 밑에 있는 자원들은 외부에서 호출돼도 보여지지 않는다. (항상 서버를 거쳐서 내부에서 호출되어야함)

        // Controller 에서 view 로 이동
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);   // servlet 에서 JSP 호출
        // 다른 서블릿이나 JSP 로 이동할 수 있는 기능으로 서버 내부에서 다시 호출이 발생한다. (클라이언트에서 인지못하고 url 변경 없음)
        // 클라이언트에서 다시 요청이 이뤄지는 리다이렉트와 다르다는 점!!
    }
}
