package com.example.cicd1216_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hicicd")
    public String hicicd(){
        return "hi 1216 owo";
    }

    @GetMapping("/hicicd2")
    public String hicicd2(){
        return "hi 1216 owo2";
    }

    @GetMapping("/hicicd3")
    public String hicicd3(){
        return "새로운 cicd 적용";
    }
}
