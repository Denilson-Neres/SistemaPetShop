/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.Raca;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;
import br.edu.ifnmg.LogicaAplicacao.RacaRepo;

/**
 *
 * @author Denilson
 */
public class RacaDAO extends DataAccessObject<Raca> 
        implements RacaRepo{
    
    public RacaDAO(){
        super(Raca.class);
    }

    @Override
    public List<Raca> Buscar(Raca obj) {
        String jpql = "select e from Raca e";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj.getRaca().length() > 0){
            filtros += "r.raca like :raca"; 
            parametros.put("raca", obj.getRaca()+"%");
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
