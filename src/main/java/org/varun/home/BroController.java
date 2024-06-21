package org.varun.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

    @GetMapping("/bat")
    public String sugar(){
        return "/WEB-INF/view/MrfCricketBat.jsp";
    }
}
