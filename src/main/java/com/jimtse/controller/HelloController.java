package com.jimtse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jimtse
 * @since 2023-04-14
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/index")
    public Object Hello(){
        return "hello";
    }
}
