package com.alkemyjava2.clase8.controller;


import com.alkemyjava2.clase8.service.AsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    private final AsyncService asyncService;
    public  AsyncController ( AsyncService asyncService){
      this.asyncService=asyncService;
    }

      @GetMapping("/runAsync")
      public String runAsync(){
          asyncService.runAsyncTask();
          return  "ejecuto run async desde el controller";
      }

      @GetMapping("/supplyAsync")
      public String ejcutarTareaConResultadoEncadenado(){
        asyncService.ejcutarTareaConResultadoEncadenado();
        return  "ejecuto tareas encadenadas desde el controller";
      }

}
