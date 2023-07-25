package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping // 스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러로 인식
@ResponseBody
public interface OrderControllerV1 {

    /**
     * 인터페이스의 경우 @RequestParam 으로 파라메터 이름을 명시해 주어야 함.
     * 컴파일시 인식 못하는 경우가 발생 할 수 있음.
     * @param itemId
     * @return
     */
    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();
}
