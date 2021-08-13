/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.LogicaAplicacao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author DENILSON
 */
@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "Login", length = 150, unique = true, nullable = false)
    private String login;
    
    @Column(name = "Senha", length = 250, nullable = false)
    private String senha;
    
    @Column(nullable = false, length = 250)
     String nome;
    
    @Column(nullable = false, length = 250, unique = true)
    String documento;
    
     @Column(length = 250)
    private String telefone;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private TipoUsuario tipo;
    
    @Version
    private int version;
    
    public Usuario() {
        this.nome = "";
        this.id = 0L;
        this.login = "";
        this.senha = "";
        this.tipo = TipoUsuario.Funcionario;
        this.documento = "";
        this.telefone = "";
        this.version = 1;
    }

    public Usuario(String login, String senha, TipoUsuario tipo, String nome, String documento) {
        this.id = 0L;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        this.documento = documento;
        this.telefone = null;
        this.version = 1;
    }

        public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getLogin() {
        return login;
        
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.login;
    }
    
}
