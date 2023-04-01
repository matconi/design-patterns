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

public class IcmsRJ implements CalculoPorRegiao{

    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {  
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
    
}