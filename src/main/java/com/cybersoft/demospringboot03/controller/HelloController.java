package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.entity.Student;
import com.cybersoft.demospringboot03.entity.UsersEntity;
import com.cybersoft.demospringboot03.payload.request.LoginRequest;
import com.cybersoft.demospringboot03.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* @Controller: Dùng định nghĩa đường dẫn mà nội dung đường dẫn trả ra HTML
* @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng viết API
*
* @RestController: Là sự kết hợp của @Controller và @ResponseBody => Viết API
*/
@RestController
@RequestMapping("/hello")
public class HelloController {
    // Tham số truyền trên trình duyệt: @RequestParam.
    // Tham số truyền ngầm: @RequestParam.
    // Tham số đóng vai trò như là 1 đường dẫn @PathVariable.
    // Tham số là đối tượng: @RequestBody.

    @Autowired
    private Student student;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<?> hello(){
        List<UsersEntity> list = userRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/cybersoft")
    public String helloCyberSoft(@RequestBody LoginRequest loginRequest){
        return "Hello Spring CyberSoft " + loginRequest.getUsername() + " - " + loginRequest.getPassword()    ;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id){
        return new ResponseEntity<>(  "Update " + id, HttpStatus.OK);
    }
}
