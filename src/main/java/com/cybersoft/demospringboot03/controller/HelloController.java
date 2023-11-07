package com.cybersoft.demospringboot03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Controller: Dùng định nghĩa đường dẫn mà nội dung đường dẫn trả ra HTML
* @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng viết API
*
* @RestController: Là sự kết hợp của @Controller và @ResponseBody => Viết API
*/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/cybersoft")
    public String helloCyberSoft(){
        return "Hello Spring CyberSoft";
    }
}
