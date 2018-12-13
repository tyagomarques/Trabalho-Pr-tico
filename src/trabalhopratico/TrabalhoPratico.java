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
        Admin a = new Admin("fabio","putas");
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
                        menuConta(membros);
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


public static void menuConta(ArrayList<Pessoa> membros){
        int escolha3 = 0;
        int n = 0;
        double valor = 0;
        double pagar = 0;
        String s;
        
        System.out.println("1 - Adicionar Conta a Pagar;\n" + "2 - Remover Conta a Pagar;\n" +"3 - Consultar Contas.\n");
        escolha3 = Ler.umInt();
       
        switch(escolha3){       // Sub-menu Contas
            case 1: // Inserir conta        FALTA DIVIDIR PELAS PESSOAS
                System.out.println("Valor da conta : ");
                valor = Ler.umDouble();
                System.out.println("Descrição da conta : ");
                s = Ler.umaString();
                Contas npr = new Contas(valor,s);
                //membros.get(0).setContasAdmin(npr);    // Arraylist que armazena valor total de cada conta a pagar TRATAR DEPOIS, NAO TE ESQUECAS DIOGO
                n = membros.size();  // tamanho array pessoas
                pagar = valor/n; // Set valor para cada pessoa : valor/nºpessoas
                // Adicionar valor individual que cada pessoa tem a pagar
                Contas npr2 = new Contas(pagar,s);
                // Assumir que Admin está no arrayList pessoa -> VERIFICAR  
                for(int i = 0; i < n ; i++){
                    membros.get(i).setContas(npr2);
                }
                break;

            default:  
                System.out.println("Opção não existente!!");
                break;
            }
        
    }
    
  /*  public void menuTarefas() { /*Por fazer
            int escolha = 0;
            System.out.println("1 – Trabalhadores;\n" + "2 – Locais de trabalho;\n" + "3 – Consultar todos os locais;\n" + "4 – Sair.\n");
            escolha = Ler.umInt();
            while (true) {       // Menu Inicial
                switch (escolha) {
                    case 1: menuTrabalhador();
                        break;
                    case 2: menuLocais();
                        break;
                    case 3: System.out.println(toStringEspaco()+"\n");
                        break;
                    case 4:
                        return;     // Sair do menu
                    default:
                        System.out.println("Opção não existente!!");
                        break;
                }
                System.out.println("Opção : ");
                escolha = Ler.umInt();
            } 
    }*/
}