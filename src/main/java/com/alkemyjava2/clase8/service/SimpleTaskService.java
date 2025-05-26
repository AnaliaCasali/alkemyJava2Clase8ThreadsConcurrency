package com.alkemyjava2.clase8.service;


import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class SimpleTaskService {

    private final ExecutorService executorService
        = Executors.newFixedThreadPool(4);

    public  void executeTask(){
      executorService.submit(
          ()->{
              try{
                System.out.println("inciando hilo en pool.."
                        +  Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("tarea completada .. " +
                    Thread.currentThread().getName());

              } catch (InterruptedException e) {
                  System.out.println("Hilo interrumpido");
              }

          });

    }

  public void shutDown(){
      executorService.shutdown();
  }

}
