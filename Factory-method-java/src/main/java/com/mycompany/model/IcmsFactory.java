/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Marcos
 */
public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado){
        if(nomeEstado.equalsIgnoreCase("ICMS_MG")){
            return new IcmsMG();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
            return new IcmsSP();
        }
        System.out.println("Valor inválido - ICMS não cadastrado");
        return null;
    }
}
