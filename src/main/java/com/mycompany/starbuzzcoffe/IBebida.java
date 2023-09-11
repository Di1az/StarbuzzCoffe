/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.starbuzzcoffe;

/**
 * La interfaz IBebida define un contrato para representar bebidas en un sistema.
 * Las clases que implementen esta interfaz deben proporcionar una descripción
 * de la bebida y calcular su costo.
 */
public interface IBebida {
    
     /**
     * Obtiene la descripción de la bebida.
     * @return Una cadena que describe la bebida.
     */
    public String getDescription();
    
    /**
     * Calcula el costo de la bebida.
     * @return El costo de la bebida como un valor decimal.
     */
    public double costo();
}
