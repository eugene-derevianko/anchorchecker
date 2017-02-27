package com.symulakr.anchorchecker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class GreetingController {

   @RequestMapping("/resource")
   @ResponseBody
   public Map<String, Object> home(){
      Map<String, Object> model = new HashMap<>();
      model.put("id", UUID.randomUUID().toString());
      model.put("content", "Hello World");
      return model;
   }

}
