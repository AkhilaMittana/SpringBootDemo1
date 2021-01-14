package com.miraclesoft.itg.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sbms {
    @RequestMapping("/")
   int add()
   {
    	return 6;
   }
}
