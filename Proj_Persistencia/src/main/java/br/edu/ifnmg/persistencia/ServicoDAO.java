/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Servico;
import br.edu.ifnmg.LogicaAplicacao.ServicoRepo;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author DENILSON
 */
public class ServicoDAO extends DataAccessObject<Servico> 
        implements ServicoRepo{

    public ServicoDAO() {
        super(Servico.class);
    }
    
    @Override
    public List<Servico> Buscar(Servico obj) {
        
        String jpql = "select a from Servico a";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj.getDescricao().length() > 0){
            filtros += "a.descricao like :descricao"; 
            parametros.put("descricao", obj.getDescricao()+"%");
        }
        
        if(filtros.length() > 0)
            jpql = jpql + " where " + filtros;
        
        var query = this.manager.createQuery(jpql);
        
        for(String chave : parametros.keySet()){
            query.setParameter(chave, parametros.get(chave));
        }
        
        return query.getResultList();
    }
    
}
