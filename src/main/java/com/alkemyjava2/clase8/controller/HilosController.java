package com.alkemyjava2.clase8.controller;


import com.alkemyjava2.clase8.model.HiloRunnable;
import com.alkemyjava2.clase8.model.MiHilo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HilosController {

  @GetMapping("/iniciar-hilo-thread")
  public String iniciarHijoThread(){
    MiHilo hilo=new MiHilo();
    hilo.start();
    return  "Hilo Iniciado desde Controller";
  }

  @GetMapping("/iniciar-hilo-runnable")
  public String iniciarHiloRunnable(){
    Thread hilo= new Thread(new HiloRunnable("miRunnable"));
    hilo.start();
    return "Hilo Runnable desde Controller";
  }

}
