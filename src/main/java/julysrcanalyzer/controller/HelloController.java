package julysrcanalyzer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
  
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello";
  }

  @GetMapping("/hello1")
  public String sayHello1() {
    return "Hello1";
  }
}
