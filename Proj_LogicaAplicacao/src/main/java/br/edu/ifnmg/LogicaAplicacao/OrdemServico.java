/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.LogicaAplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author DENILSON
 */
@Entity
@Table(name = "OrdemServico")
public class OrdemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //@Id
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "Cliente_id", nullable = false)
    private Cliente cliente;    
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Usuario usuario;
    
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Pagamento pagamento;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private StatusOS status;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "ordemServico")
    private List<OrdemServicoItens> itens;
    
    @Version
    private int version;
    
    
    public OrdemServico() {
        
        this.id = 0L;
        this.cliente = null;
        this.valorTotal = new BigDecimal("0.00");
        this.status = StatusOS.Aberto;
        this.data = new Date();
        this.itens = new ArrayList<>();
        this.version = 1;
        this.usuario = null;
        this.pagamento = null;
    }

    public OrdemServico(Cliente cliente, StatusOS status, Usuario usuario) {
        this.id = 0L;
        this.cliente = cliente;
        this.valorTotal = new BigDecimal("0.00");
        this.status = status;
        this.data = new Date();
        this.itens = new ArrayList<>();
        this.version = 1; 
        this.usuario = usuario;
        this.pagamento = null;
    }

    public Usuario getUser() {
        return usuario;
    }

    public void setUser(Usuario user) {
        this.usuario = user;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date dtVisita) {
        this.data = dtVisita;
    }

    public StatusOS getStatus() {
        return status;
    }

    public void setStatus(StatusOS status) {
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<OrdemServicoItens> getItens() {
        return itens;
    }

    public void setItens(List<OrdemServicoItens> itens) {
        this.itens = itens;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
     public boolean add(OrdemServicoItens itens){
        itens.setOrdemServico(this);
        if(! this.itens.contains(itens)){
            this.itens.add(itens);
            this.valorTotal = this.valorTotal.add(
                   itens.getValor());
                    //itens.getValor().multiply(BigDecimal.valueOf(itens.getQuantidade()))); //usado para multiplicar valor x quantidade
            return true;
        }
        return false;
    }
    
    public boolean remove(OrdemServicoItens itens){
        if(this.itens.contains(itens)){
            this.itens.remove(itens);
            this.valorTotal = this.valorTotal.subtract(
                    itens.getValor());
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final OrdemServico other = (OrdemServico) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return this.id.toString();
    }
    
}
