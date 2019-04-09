package top.fissile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.fissile.service.SomeService;

@RestController
public class SomeController {

    @Autowired
    private SomeService someService;

    @ResponseBody
    @GetMapping("/sayHello")
    public String sayHello(String name) {
        String result = someService.sayHello(name);
        return result;
    }
}
