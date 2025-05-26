package com.alkemyjava2.clase8.model;

public class HiloRunnable implements Runnable {

  private final String nombre;

  public  HiloRunnable(String nombre){ this.nombre=nombre;}

  @Override
  public void run() {
    System.out.println(" Hilo desde Runnable " +  nombre
       + " " +  Thread.currentThread().getName() );
  }
}
