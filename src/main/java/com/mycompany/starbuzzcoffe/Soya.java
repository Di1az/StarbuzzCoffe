/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffe;

/**
 *
 * @author danie
 */
public class Soya extends CondimentoDecorador{
    public Soya(Bebida bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescription(){
        return bebida.getDescription()+", Soya";
    }
    
    @Override
    public double costo(){
        double aumento = bebida.costo()+10.00;
        return aumento;
    }
}
