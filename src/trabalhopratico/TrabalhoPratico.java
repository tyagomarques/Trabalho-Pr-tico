/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;

import java.util.ArrayList;
import myinputs.Ler;

/**
 *
 * @author Diogo Pinheiro
 */
public class TrabalhoPratico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        ArrayList<Pessoa> membros = new ArrayList<Pessoa> ();
        Pessoa a = new Pessoa("fabio","putas");
        a.setNota("HELLO MA DUDES");
        membros.add(a);
        String alma;
        String password;
        int ind = -1;
        
        do{                           // PROCURA A PESSOA NA LISTA E DEVOLVE O SEU
            System.out.print("Nome :");   // ID, REPETE-SE ENQUANTO O NOME NAO EXISTIR
            alma = Ler.umaString();                    // NA LISTA
            for(int i = 0; i < membros.size(); i++)
            {
                if(membros.get(i).getNome().equals(alma))
                {
                ind = i;
                break;
                }
            }
        }while(ind == -1);
        
        int tentativas = 0;
        System.out.println("");        // PEDE A PASSWORD ENQUANTO NÃO A ACERTA
        do{
            System.out.print("Password :");
            password = Ler.umaString();
            if(membros.get(ind).getPass().equals(password))
            {
               break; 
            }
            tentativas++;
        }while (tentativas < 5);
        
        if(tentativas == 5)
        {
            throw new Exception("Excedeste o número de tentativas");
        }
        
        
        
        for (int i = 0; i < Pessoa.getNum(); i++)     // APRESENTA AS NOTAS DOS 
        {                                               // RESIDENTES
            System.out.println(membros.get(i).getNota());
        }
        
        
        //-------------------------------------------------------//
        
        int escolha;
        do
        {
            System.out.println("1 - Menu Admin");
            System.out.println("2 - Consultar Contas a pagar");
            System.out.println("3 - Consultar Tarefas");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("ESCOLHA :");
            
            escolha = Ler.umInt();
            
            switch(escolha)
            {
                case 1 :  System.out.println("PUTAS BEBE");
                            MenuAdmin(membros);
                            break;
                    
                case 2 : break;
                
                case 3 : break;
                
                case 4 :
                                
                                // gravar no ficheiro//
                                break;
            }
            
        }
        while(escolha != 4);   
    }

    private static void MenuAdmin(ArrayList<Pessoa> membros) {
      int escolha = 0;
        
        while(escolha != 4){       // Menu Inicial
            System.out.println("1 – Gestão Pessoas;\n" + "2 – Gestão Contas;\n" + "3 – Gestão Tarefas;\n" + "4 – Sair.\n");
            escolha = Ler.umInt();
        
            switch(escolha){
                case 1: 
                        menuGestaoPessoas(membros);
                        break;
                case 2:
                    //menuConta();
                    break;
                        
                case 4:
                    break;     // Sair do menu
                default:  
                    System.out.println("Opção não existente!!\n");
                    break;
            }            
        }
            

    }



public static void menuGestaoPessoas(ArrayList<Pessoa> membros)
    {
        Pessoa novap;
        Pessoa test;
        String nome;
        int opcao = 0;
       
        
        do
        {
            System.out.println("\t\t Menu de Gestão de Pessoas");
            System.out.println("\t 1 - Adicionar Pessoa; \n\t 2 - Remover Pessoa;\n \t 3 - Sair para o menu principal\n");
            opcao = Ler.umInt();
            
            switch(opcao){       // Sub-menu 1
                case 1: // Inserir Pessoa
                        System.out.println("Nome da Pessoa : ");
                        nome = Ler.umaString();
                        novap = new Pessoa(nome);
                        membros.add(novap);
                  break;
                case 2: // Remover Pessoa
                        System.out.println("Nome da Pessoa : ");
                        nome = Ler.umaString();

                        for(int i = 0; i < membros.size(); i++)
                        {
                            test = (Pessoa) membros.get(i);
                            if( test.getNome().equals(nome) )
                                membros.remove(i);

                        }                  
                        break;
                case 3:
                        break;
                default: 
                       System.out.println("Introduziu uma opção que não existe!!!");
            }
        }while(opcao != 3);
    }



}