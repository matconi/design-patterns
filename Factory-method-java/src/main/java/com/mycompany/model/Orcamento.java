/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.math.BigDecimal;

public class Orcamento {
    public BigDecimal valorOrcamento;
    public String icmsRegiao;

  
    public Orcamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        this.icmsRegiao = icmsRegiao;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public String getIcmsRegiao() {
        return icmsRegiao;
    }

    public void setIcmsRegiao(String icmsRegiao) {
        this.icmsRegiao = icmsRegiao;
    }
}
