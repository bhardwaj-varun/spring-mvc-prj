package org.varun.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
    @GetMapping("/bat")
    @ResponseBody
    public String bat(){
        return "here is your cricket bat";
    }
}
