/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.LogicaAplicacao;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
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
@Table(name = "Cliente")
//@DiscriminatorValue(value = "0")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     @Column(nullable = false, length = 250)
     String nome;

   @Column(length = 250, nullable = false)
    private String documento;
   
    @Column(length = 250)
    private String telefone;

    @Version
    private int version;

    public Cliente() {
    }
    
    public Cliente(String nome, String documento, String telefone) {
        super();
        this.id = 0L;
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    

    @Override
    public String toString() {
        return this.nome;
    }
    
}
