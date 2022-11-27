package com.practice.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController 
{
  @GetMapping("/")
 // @ResponseBody
  public String home()
  {
    return "index";
  }
  
  @GetMapping("/convert")
 // @ResponseBody
  public String prime(@RequestParam ("number")int number,Model model)
  { 
    int sum = 0;
    int digit=0;
    while(number>0)
    {
       digit = number%10;  //2
       sum=sum+digit;
       number=number/10;  //1   
    }
    String s = sum+"";

    model.addAttribute("s", s);
    return "result";
  }
}
