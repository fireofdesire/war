package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
  @ResponseBody
  @RequestMapping("/hi")
  public String hi()
  {
	  return "hi..........";
  }
}
