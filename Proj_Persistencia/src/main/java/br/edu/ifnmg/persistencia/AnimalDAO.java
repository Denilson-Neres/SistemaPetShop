/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Animal;
import br.edu.ifnmg.LogicaAplicacao.AnimalRepo;
import java.util.Hashtable;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author DENILSON
 */
public class AnimalDAO
    extends DataAccessObject<Animal> 
        implements AnimalRepo{
    
    public AnimalDAO(){
        super(Animal.class);
    }

    @Override
    public List<Animal> Buscar(Animal obj) {
        String jpql = "select a from Animal a";
        
        String filtros = "";
        
        Hashtable<String, Object> parametros = new Hashtable<>();
        
        if(obj.getNome().length() > 0){
            filtros += "a.nome like :nome"; 
            parametros.put("nome", obj.getNome()+"%");
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
