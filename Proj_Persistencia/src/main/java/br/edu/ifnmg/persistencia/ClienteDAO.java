/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.ClienteRepo;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author DENILSON
 */
public class ClienteDAO extends DataAccessObject<Cliente> 
        implements ClienteRepo{
    
    public ClienteDAO(){
        super(Cliente.class);
    }

    @Override
    public List<Cliente> Buscar(Cliente obj) {
        
      /*
        String jpql = "select c from Cliente c";
        String filtros = "";
        HashMap<String, Object> parametros = new HashMap<>();
        
        if(obj != null){
            if(obj.getNome().length() > 0){
                filtros += "c.nome like :nome";
                parametros.put("nome", obj.getNome() + "%");
                if(obj.getId()>0)
                    parametros.put("id", obj.getId());
            }
            
            
            if(obj.getTelefone() != null){
                if(obj.getTelefone().length() > 0) filtros +=" and ";
                filtros += "c.telefone = :telefone";
                parametros.put("telefone", obj.getTelefone() + "%");
            }
            
            if(obj.getDocumento() != null){
                if(obj.getDocumento().length() > 0) filtros +=" and ";
                filtros += "c.documento = :documento";
                parametros.put("documento", obj.getDocumento() + "%");
            }
            
        }    
        
        if(filtros.length() > 0)
            jpql = jpql + " where " + filtros;
        
        Query sql = this.manager.createQuery(jpql);
            
            
        if(!parametros.isEmpty())
            for(String campo: parametros.keySet())
                sql.setParameter(campo, parametros.get(campo));

        return sql.getResultList();
    
    }
    */
      
      
       String jpql = "select c from Cliente c";
    
        HashMap<String, Object> parametros = new HashMap<>();
        
            if(obj != null){

                if(obj.getNome() != null & !obj.getNome().isEmpty())
                    parametros.put("nome", obj.getNome());
                if(obj.getId()> 0)
                    parametros.put("id", obj.getId());
            }
            
            if(obj.getTelefone().length() > 0){
                String filtros = "";
                filtros += "c.telefone like :telefone";
                parametros.put("telefone", obj.getTelefone() + "%");
            }
            
             if(obj.getDocumento().length() > 0){
                String filtros = "";
                filtros += "c.documento like :documento";
                parametros.put("documento", obj.getDocumento() + "%");
            }
             
            if(!parametros.isEmpty()){
                String filtros = "";
                jpql += " where ";
                for(String campo : parametros.keySet()){
                    if(!filtros.isEmpty())
                        filtros += " and ";
                    jpql += "c." + campo + " =:" + campo;
                }
                jpql += filtros;
            }

            
            
            Query sql = this.manager.createQuery(jpql);
            
            
            if(!parametros.isEmpty())
                for(String campo: parametros.keySet())
                    sql.setParameter(campo, parametros.get(campo));
            
            return sql.getResultList();
           
    }   
}
