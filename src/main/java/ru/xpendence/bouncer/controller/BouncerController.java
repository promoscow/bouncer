package ru.xpendence.bouncer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 14.02.19
 * Time: 20:58
 * e-mail: 2262288@gmail.com
 */
@Controller
@RequestMapping("/")
public class BouncerController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("//\nBounce successful. " + LocalDateTime.now());
    }
}
