/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.LogicaAplicacao;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author DENILSON
 */
@Entity
@Table(name = "Animal")
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 250)
    private String nome;
    
   @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
   @JoinColumn(name = "Cliente_id") 
   private Cliente cliente;
    
   //@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
   @JoinColumn(name = "Raça_id") 
   private Raca raca;
    
    @Column(nullable = false, length = 250)
    private String sexo;
    
    @Column(length = 500)
    private String observacoes;
    
    @Version
    private int versao;

    public Animal() {
        this.id = 0L;
        this.nome = "";
        this.observacoes = "";
        this.sexo = "";
        this.versao = 1;
    }

    public Animal(String nome, String sexo, Cliente cliente, Raca raca) {
        this.id = 0L;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.observacoes = observacoes;
        this.versao = 1;
        this.cliente = cliente;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
