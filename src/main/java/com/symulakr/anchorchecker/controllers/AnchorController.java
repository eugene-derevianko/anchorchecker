package com.symulakr.anchorchecker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/anchor")
public class AnchorController {

   private static Map<String, String> responses = new HashMap<>();

   @GetMapping
   @ResponseBody
   public Map<String, String> responses(){
      return responses;
   }

   @PostMapping
   @ResponseBody
   public String response(String url){
      String id = UUID.randomUUID().toString();
      responses.put(id, url);
      return id;
   }

}
