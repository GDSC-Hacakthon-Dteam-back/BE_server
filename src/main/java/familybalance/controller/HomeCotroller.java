package familybalance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCotroller {
    @GetMapping("/") // 기본 페이지
    public String index() {
        return "index";
    }
}
git commit