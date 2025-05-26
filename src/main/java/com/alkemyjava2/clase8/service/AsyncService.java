package com.alkemyjava2.clase8.service;


import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

  public void runAsyncTask(){
    CompletableFuture<Void> future=
        CompletableFuture.runAsync(
            ()-> {
              System.out.println(" Tarea asincrona desde completable future " +
                  Thread.currentThread().getName());
            }
        );

      future.thenRun(
          ()-> System.out.println("Tarea asincrona completada")
      );
  }

  public void ejcutarTareaConResultadoEncadenado(){
    CompletableFuture<Integer> future
      = CompletableFuture.supplyAsync(
        ()->
        {
          System.out.println("inicio la tarea " + Thread.currentThread().getName());
          return 5;
        }).thenApply(
        (resultado)-> {
          System.out.println("segunda  tarea " + Thread.currentThread().getName());
          return resultado * 2;
        }).thenApply(
        (resultado)-> {
          System.out.println("segunda  tarea " + Thread.currentThread().getName());
          return resultado + 10;
        });

        future.thenAccept(
              resultado -> System.out.println("El resultado es  " + resultado)
        );
  }

  public CompletableFuture<Integer> resolverEj(){

      CompletableFuture<Integer> future
          =CompletableFuture.supplyAsync(
              ()-> 10  )
          .thenApply(
              (resul)-> resul * 2)
          .thenApply( (resul) ->resul +5 ) ;

        future.thenAccept( resultado->{
            System.out.println( resultado);});


      return  future;
  }

}
