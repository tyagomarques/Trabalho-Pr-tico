/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;
import java.util.ArrayList;
import myinputs.*;
/**
 *
 * @author Diogo Pinheiro
 */
public class Admin extends Pessoa{
    private ArrayList<Pessoa> pessoa;
    private ArrayList<Espaco> espacos;
    private ArrayList<Contas> contas;
    
   
    public Admin(String nome){
        super(nome);
        
    }
    
    public void insert(Pessoa a){
        pessoa.add(a);
    }
    
    
    public void menuConta(){
        int escolha3 = 0;
        double valor = 0;
        String s;
        System.out.println("1 - Adicionar Conta a Pagar;\n" + "2 - Remover Conta a Pagar;\n" +"3 - Consultar Contas.\n");
        escolha3 = Ler.umInt();
        switch(escolha3){       // Sub-menu Contas
            case 1: // Inserir conta
                System.out.println("Valor da conta : ");
                valor = Ler.umDouble();
                System.out.println("Descrição da conta : ");
                s = Ler.umaString();
                Contas cont = new Contas(valor, s);
                contas.add(cont);   
                break;
            case 2: // Remover conta
                System.out.println("Escreva ID : ");  
                valor = Ler.umInt();            
                for(Contas e : contas) {
                        if (e.getID() == valor) {
                           contas.remove(e);
                        }
                    }
                break;
            }
    }
      
     //----------------------------------
    public void menuDeCriaConta()
    {
        System.out.println("\t 1 - Adicionar Pessoa; \n\t 2 - Remover Pessoa;\n");
        int escolha2 = Ler.umInt();
        switch(escolha2){       // Sub-menu 1
            case 1: // Inserir Pessoa
                System.out.println("Nome da Pessoa : ");
                String nome = Ler.umaString();

              break;
            case 2: // Remover Pessoa


            break;
        }
    }
    
            
            
    //----------------------------------
    public void menu(){
        int escolha = 0;
        System.out.println("1 – Gestão Pessoas;\n" + "2 – Gestão Contas;\n" + "3 – Gestão Tarefas;\n" + "4 – Remov."  + "5.Sair\n");
  
        escolha = Ler.umInt();
        while(escolha != 5){ // Menu Inicial
            switch(escolha){
                case 1: 
                    
                    break;
                case 2:
                    System.out.println("1 - Adicionar Conta a Pagar;\n" + "2 - Remover Conta a Pagar;\n");
                    int escolha3 = Ler.umInt();
                    switch(escolha3){       // Sub-menu 1
                        case 1: // Inserir conta
                            
                            System.out.println("Valor da conta : ");
                            int valor = Ler.umInt();
                            
                          break;
                        case 2: // Remover conta
                            
                            
                        break;
                    }
                    break;
                        
                case 5:
                    break;
                    
                default: 
                        System.out.println("Introduziu um número inválido!");
                
            }
            System.out.println("Opção : ");
            escolha = Ler.umInt();
        }

    }
}