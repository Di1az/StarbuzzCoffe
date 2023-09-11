/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffe;

/**
 * La clase CondimentoDecorador es una clase base para los decoradores de bebidas.
 * Extiende la clase Bebida y proporciona una estructura común para los decoradores.
 */
public class CondimentoDecorador extends Bebida{
    public Bebida bebida; // Referencia a la bebida base que se va a decorar
    
    /**
     * Obtiene la descripción de la bebida decorada. 
     * Este método debe ser sobrescrito por los decoradores concretos.
     * @return La descripción de la bebida decorada (o de la bebida base si no se decora).
     */
    @Override
    public String getDescription() {
       return descripcion;
    }
    
    /**
     * Calcula el costo de la bebida decorada. 
     * Este método debe ser sobrescrito por los decoradores concretos.
     * @return El costo de la bebida decorada (o de la bebida base si no se decora).
     */
    @Override
    public double costo() {
        return costo;
    }
}
