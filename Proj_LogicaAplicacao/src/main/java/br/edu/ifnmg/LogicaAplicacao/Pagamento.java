/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.LogicaAplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Denilson
 */
@Entity
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 50)
    private int quantParcelas;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal valor;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal valorDesconto;                                                                                                                               
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private TipoPagamento tipo;

    public Pagamento() {
        super();
        this.id = 0L;
        this.quantParcelas = 0;
        this.valor = new BigDecimal("0.00");
        this.valorDesconto = new BigDecimal("0.00");
        this.tipo = TipoPagamento.Dinheiro;
    }
    
    public Pagamento(int quantParcelas ,TipoPagamento tipo){
        super();
        this.id = 0L;
        this.quantParcelas = quantParcelas;
        this.valor = new BigDecimal("0.00");
        this.valorDesconto = new BigDecimal("0.00");
        this.tipo = tipo;
    }
    

    public int getQuantParcelas() {
        return quantParcelas;
    }

    public void setQuantParcelas(int quantParcelas) {
        this.quantParcelas = quantParcelas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.id.toString();
    }
    
}
