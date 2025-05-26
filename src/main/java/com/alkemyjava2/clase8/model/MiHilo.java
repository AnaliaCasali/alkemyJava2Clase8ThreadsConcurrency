package com.alkemyjava2.clase8.model;



public class MiHilo extends Thread {
  @Override
  public  void run(){
    System.out.println("Ejecutando una tarea desde Thread MiHilo");
  }
}
