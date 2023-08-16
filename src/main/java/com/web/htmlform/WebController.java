package com.web.htmlform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
   @RequestMapping(value = "/embeddedForm")
   public String index() {
      return "embeddedForm";
   }
}