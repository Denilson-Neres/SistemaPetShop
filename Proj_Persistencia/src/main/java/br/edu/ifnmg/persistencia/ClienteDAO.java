/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.ClienteRepo;
import java.util.List;

/**
 *
 * @author DENILSON
 */
public class ClienteDAO
    extends DataAccessObject<Cliente> 
        implements ClienteRepo{
    
    public ClienteDAO(){
        super(Cliente.class);
    }

    @Override
    public List<Cliente> Buscar(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
