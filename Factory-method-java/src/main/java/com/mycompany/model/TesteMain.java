/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Marcos
 */
import java.math.BigDecimal;


public class TesteMain {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"), "Icms_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("Icms_MG").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }   
    }