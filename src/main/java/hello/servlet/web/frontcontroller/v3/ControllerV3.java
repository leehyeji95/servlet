package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    /**
     *
     * @param paramMap
     * @return modelView
     */

    // Servlet 에 종속적이지 않음
    ModelView process(Map<String, String> paramMap);
}
