/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffe;

/**
 * La clase Chocolate es un decorador concreto que extiende la funcionalidad de una bebida
 * al agregar chocolate a ella.
 */
public class Chocolate extends CondimentoDecorador{
    
     /**
     * Constructor de la clase Chocolate.
     * @param bebida La bebida base a la que se le agregará chocolate.
     */
    public Chocolate(Bebida bebida){
        this.bebida = bebida;
    }
    
    /**
     * Obtiene la descripción de la bebida decorada con chocolate.
     * @return Una cadena que describe la bebida con la adición de chocolate.
     */
    @Override
    public String getDescription(){
        return bebida.getDescription()+", Chocolate";
    }
    
     /**
     * Calcula el costo total de la bebida decorada con chocolate.
     * @return El costo total de la bebida con la adición de chocolate.
     */
    @Override
    public double costo(){
        // Se suma el costo del chocolate (8.00) al costo de la bebida base.
        double aumento = bebida.costo()+ 8.00;
        return aumento;
    }
}
