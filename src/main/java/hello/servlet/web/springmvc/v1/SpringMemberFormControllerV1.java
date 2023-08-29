package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 자동으로 Spring bean 으로 등록, Spring MVC 에서 MVC 기반 컨트롤러로 인식한다.
// 클래스 레벨에 있어야 한다.
//@Controller
@Component
@RequestMapping
public class SpringMemberFormControllerV1 {
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
