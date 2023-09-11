/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffe;

/**
 * La clase DarkRoast representa una bebida concreta llamada "Dark Roast" en el contexto de un sistema que utiliza el patrón Decorator.
 * Hereda de la clase Bebida y proporciona una implementación específica para esta bebida en particular.
 */
public class DarkRoast extends Bebida{
    
     /**
     * Constructor de la clase DarkRoast.
     * Crea una instancia de DarkRoast y establece su descripción como "Dark Roast" y su costo en 45.00 unidades.
     */
    public DarkRoast(){
        super.descripcion ="Dark Roast";
        super.costo = 45.00;
    }
}
