package org.varun.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

    @GetMapping("/sugar")
    @ResponseBody
    public String sugar(){
        return "hello from controller";
    }
}
