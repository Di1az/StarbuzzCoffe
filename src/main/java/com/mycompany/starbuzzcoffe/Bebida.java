/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffe;

/**
 * La clase Bebida representa una bebida base que implementa la interfaz IBebida.
 * Puede ser utilizada como base para decoradores que agregan funcionalidad adicional
 * a las bebidas.
 */
public class Bebida implements IBebida{
    private IBebida Ibebida;// Referencia a una posible bebida decorada
    String descripcion = "Bebida";// Descripción de la bebida base
    double costo;// Costo de la bebida base
    
     /**
     * Constructor por defecto de la bebida base.
     */
    public Bebida() {
    }
    
    /**
     * Constructor que permite decorar una bebida base con otra bebida (decorador).
     * @param Ibebida La bebida que se va a decorar.
     */
    public Bebida(IBebida Ibebida){
        this.Ibebida = Ibebida;
    }
    
    /**
     * Obtiene la descripción de la bebida, que puede ser la de la bebida base
     * o la de una bebida decorada.
     * @return Una cadena que describe la bebida.
     */
    @Override
    public String getDescription() {
       return descripcion;
    }
    
    /**
     * Calcula el costo de la bebida, que puede ser el de la bebida base
     * o el de una bebida decorada.
     * @return El costo de la bebida como un valor decimal.
     */
    @Override
    public double costo() {
        return costo;
    }
}
