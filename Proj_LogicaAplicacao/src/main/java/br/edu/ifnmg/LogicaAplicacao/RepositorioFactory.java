/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.LogicaAplicacao;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DENILSON
 */
public class RepositorioFactory {
  private static Properties propriedades = new Properties();
   
    private static UsuarioRepo usuario;
    private static ClienteRepo cliente;
    private static ServicoRepo servico;
    private static OrdemServicoRepo os;
    private static AnimalRepo animal;
    private static RacaRepo raca;
    private static PagamentoRepo pagamento;
    
    
    static{
        
        FileReader leitorArquivo = null;
       
        try {
           
            File arquivoPropriedades = new File ("config.properties");
            leitorArquivo = new FileReader(arquivoPropriedades);
            propriedades.load(leitorArquivo);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                leitorArquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static Object getInstancia(String nomeclasse){
        
         try{
            Class classe = Class.forName(nomeclasse);
            Object instancia =  classe.getDeclaredConstructor().newInstance();
            
            return instancia;           
           
            
          }catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }  
         
        return null;
    }
    
    
    public static UsuarioRepo getUsuarioRepo(){
        if(usuario == null){
            String nomeclasse = propriedades.getProperty("UsuarioRepo");
            usuario = (UsuarioRepo) getInstancia(nomeclasse);
        }
        return usuario;       
    
    }
    
     
      public static ServicoRepo getServicoRepo(){
        if(servico == null){
            String nomeclasse = propriedades.getProperty("ServicoRepo");
            servico = (ServicoRepo) getInstancia(nomeclasse);
        }
        return servico;       
    
    }
   
      
     public static ClienteRepo getClienteRepo(){
        if(cliente == null){
            String nomeclasse = propriedades.getProperty("ClienteRepo");
            cliente = (ClienteRepo) getInstancia(nomeclasse);
        }
        return cliente;       
    
    }     
     
       public static OrdemServicoRepo getOrdemServicoRepo(){
        if(os == null){
            String nomeclasse = propriedades.getProperty("OrdemServicoRepo");
            os = (OrdemServicoRepo) getInstancia(nomeclasse);
        }
        return os;       
    
    }       
       
    public static AnimalRepo getAnimalRepo(){
        if(animal == null){
            String nomeclasse = propriedades.getProperty("AnimalRepo");
            animal = (AnimalRepo) getInstancia(nomeclasse);
        }
        return animal;       
    
    }  
    
    public static RacaRepo getRacaRepo(){
        if(raca == null){
            String nomeclasse = propriedades.getProperty("RacaRepo");
            raca = (RacaRepo) getInstancia(nomeclasse);
        }
        return raca;       
    
    }
    
    public static PagamentoRepo getPagmentoRepo(){
        if(pagamento == null){
            String nomeclasse = propriedades.getProperty("PagamentoRepo");
            pagamento = (PagamentoRepo) getInstancia(nomeclasse);
        }
        return pagamento;       
    
    }
        
}
