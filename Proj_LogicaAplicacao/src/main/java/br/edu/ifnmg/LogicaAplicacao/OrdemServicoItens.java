/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.LogicaAplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author DENILSON
 */
@Entity
@Table(name = "OrdemServicoItens")
public class OrdemServicoItens implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "OrdemServico_id", nullable = false) 
    private OrdemServico ordemServico;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "Servico_id", nullable = false)
    private Servico servico;
    
    
    @Id
    @ManyToOne
    @JoinColumn(name = "Animal_id", nullable = false)
    private Animal animal;
  /*
    private int quantidade;
     */
    @Column(precision = 8, scale = 2)
    private BigDecimal valor;
    
   
    public OrdemServicoItens() {
               
        this.ordemServico = null;       
        this.servico = null;
        //this.quantidade = 0;
        this.valor = new BigDecimal("0.00");
       
    }

    public OrdemServicoItens(Servico servico) {
        this.servico = servico;
       // this.quantidade = quantidade;
        this.valor = servico.getValor();  
        //this.ordemServico = null; 
    }
      
    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
/*
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

*/
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.ordemServico);
        hash = 79 * hash + Objects.hashCode(this.animal);
        hash = 79 * hash + Objects.hashCode(this.servico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrdemServicoItens other = (OrdemServicoItens) obj;
       if (!Objects.equals(this.animal, other.animal)) {
            return false;
        }
        if (!Objects.equals(this.ordemServico, other.ordemServico)) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ordemServicoItens";
    }
    
}
