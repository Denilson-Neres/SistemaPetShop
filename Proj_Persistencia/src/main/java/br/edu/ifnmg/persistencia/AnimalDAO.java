/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Animal;
import br.edu.ifnmg.LogicaAplicacao.AnimalRepo;
import java.util.List;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
