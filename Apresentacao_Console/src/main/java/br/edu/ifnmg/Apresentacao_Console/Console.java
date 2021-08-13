/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Apresentacao_Console;

import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.ClienteRepo;
import br.edu.ifnmg.LogicaAplicacao.OrdemServico;
import br.edu.ifnmg.LogicaAplicacao.OrdemServicoItens;
import br.edu.ifnmg.LogicaAplicacao.OrdemServicoRepo;
import br.edu.ifnmg.LogicaAplicacao.Servico;
import br.edu.ifnmg.LogicaAplicacao.ServicoRepo;
import br.edu.ifnmg.LogicaAplicacao.StatusOS;
import br.edu.ifnmg.LogicaAplicacao.TipoUsuario;
import br.edu.ifnmg.LogicaAplicacao.Usuario;
import br.edu.ifnmg.LogicaAplicacao.UsuarioRepo;
import br.edu.ifnmg.persistencia.ClienteDAO;
import br.edu.ifnmg.persistencia.OrdemServicoDAO;
import br.edu.ifnmg.persistencia.ServicoDAO;
import br.edu.ifnmg.persistencia.UsuarioDAO;

/**
 *
 * @author DENILSON
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    
    public static void criarBase(){
        
        UsuarioRepo ur = new UsuarioDAO();
        ur.Salvar(new Usuario("Denilson", "123",TipoUsuario.Funcionario, "Denilson Neres","122.121.212-2"));
        ur.Salvar(new Usuario("Pedro", "231",TipoUsuario.Administrador, "Pedro Carlos", "13.130.023"));
        
        ClienteRepo cr = new ClienteDAO();
        cr.Salvar(new Cliente("Suelem Ferreira","000.000.000-00","9999-9999"));
        cr.Salvar(new Cliente("Geovana","111.111.111-11","8888-8888"));
        cr.Salvar(new Cliente("Maria","333.333.333-33","0000-0000"));
        cr.Salvar(new Cliente("Osvaldo","444.333.333-33","1111-2222"));
        cr.Salvar(new Cliente("Juliana Oliveira","333.333.333-33","4444-4444"));
        
        
        
        ServicoRepo sr = new ServicoDAO();
        sr.Salvar(new Servico("Tosa", "230"));
        sr.Salvar(new Servico("Banho", "75"));
        sr.Salvar(new Servico("Banho e Tosa", "300"));
        sr.Salvar(new Servico("Castração", "320"));
        
        var usu1 = ur.Abrir(1L);
        var usu2 = ur.Abrir(2L);
        
        var cliente1 = cr.Abrir(4L);
        var cliente2 = cr.Abrir(5L);
        
        var servico1 = sr.Abrir(1L);
        var servico2 = sr.Abrir(2L);
        var servico3 = sr.Abrir(3L);
        var servico4 = sr.Abrir(4L);
        
        OrdemServicoRepo os = new OrdemServicoDAO();
        
        OrdemServico os1 = new OrdemServico(cliente1, StatusOS.Aberto, usu2 );
        os1.add(new OrdemServicoItens(servico2, 1));
        os1.add(new OrdemServicoItens(servico1, 2));
                
        os.Salvar(os1);
        
        OrdemServico os2 = new OrdemServico(cliente1, StatusOS.Aberto, usu1 );
        os2.add(new OrdemServicoItens(servico2, 1));
        os2.add(new OrdemServicoItens(servico3, 3));
        
        os.Salvar(os2);
        
        OrdemServico os3 = new OrdemServico(cliente2, StatusOS.Aberto, usu1 );
        os3.add(new OrdemServicoItens(servico4, 1));
        os3.add(new OrdemServicoItens(servico1, 1));
        os.Salvar(os3);
        
        OrdemServico os4 = new OrdemServico(cliente1, StatusOS.Aberto, usu1 );
        os4.add(new OrdemServicoItens(servico2, 1));
        os4.add(new OrdemServicoItens(servico1, 1));
        
        os.Salvar(os4);
         
        
    }
    public static void main(String[] args) {
        
        criarBase();
        // TODO code application logic here
    }
    
}
