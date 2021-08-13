/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Especie;
import br.edu.ifnmg.LogicaAplicacao.EspecieRepo;
import java.util.List;

/**
 *
 * @author Denilson
 */
public class EspecieDAO extends DataAccessObject<Especie> 
        implements EspecieRepo{
    
    public EspecieDAO(){
        super(Especie.class);
    }

    @Override
    public List<Especie> Buscar(Especie obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
