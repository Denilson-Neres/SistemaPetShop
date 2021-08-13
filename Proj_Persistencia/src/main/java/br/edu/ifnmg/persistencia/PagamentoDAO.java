/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.LogicaAplicacao.Pagamento;
import br.edu.ifnmg.LogicaAplicacao.PagamentoRepo;
import java.util.List;

/**
 *
 * @author DENILSON
 */
public class PagamentoDAO 
    extends DataAccessObject<Pagamento> 
        implements PagamentoRepo{
    
    public PagamentoDAO(){
        super(Pagamento.class);
    }

    @Override
    public List<Pagamento> Buscar(Pagamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
