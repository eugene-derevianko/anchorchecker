package com.symulakr.anchorchecker.controllers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/anchor")
public class AnchorController {

   private static Map<String, String> responses = new HashMap<>();

   @GetMapping
   @ResponseBody
   public List<String> responses() throws IOException {
      Document doc = Jsoup.connect("https://www.github.com").get();
      Elements elements = doc.getElementsByTag("a");
      return elements.stream().map(element -> (element.attr("href"))).collect(Collectors.toList());
   }

   @PostMapping
   @ResponseBody
   public Elements response(String url) throws IOException {
      Document doc = Jsoup.connect("https://www.github.com").get();

      return doc.getElementsByTag("a");

   }

}
