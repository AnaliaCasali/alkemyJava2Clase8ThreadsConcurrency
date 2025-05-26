package com.alkemyjava2.clase8.controller;


import com.alkemyjava2.clase8.service.SimpleTaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleTaskController {

  private  final SimpleTaskService simpleTaskService;

  public  SimpleTaskController (SimpleTaskService simpleTaskService){
      this.simpleTaskService=simpleTaskService;
  }

  @GetMapping("/iniciarpool4")
  public String runTask(){
    simpleTaskService.executeTask();
    return "inicio desde controller el  pool de hilos de 4.  inicie executor";
  }

  @GetMapping("/shutdownpool4")
  public  String shutDownTask(){
    simpleTaskService.shutDown();
    return  "Shutdown pool desde controller. executor apagado";
  }
}
