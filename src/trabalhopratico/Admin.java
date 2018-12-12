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
    private ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
    private ArrayList<Espaco> espacos = new ArrayList<Espaco>();
    private ArrayList<Contas> contasPagar = new ArrayList<Contas>();
    private ArrayList<Contas> contasHist = new ArrayList<Contas>();
   
    public Admin(Pessoa pessoa){
        super(pessoa);  
    }
    
    public void insert(Pessoa a){
        pessoa.add(a);
    }
    
    public void menuGestaoPessoas()
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
                        pessoa.add(novap);
                  break;
                case 2: // Remover Pessoa
                        System.out.println("Nome da Pessoa : ");
                        nome = Ler.umaString();

                        for(int i = 0; i < pessoa.size(); i++)
                        {
                            test = (Pessoa) pessoa.get(i);
                            if( test.getNome().equals(nome) )
                                pessoa.remove(i);

                        }                  
                        break;
                case 3:
                        break;
                default: 
                       System.out.println("Introduziu uma opção que não existe!!!");
            }
        }while(opcao != 3);
    }
    
    public void menuConta(){
        int escolha3 = 0;
        double valor = 0;
        String s;
        
        System.out.println("1 - Adicionar Conta a Pagar;\n" + "2 - Remover Conta a Pagar;\n" +"3 - Consultar Contas.\n");
        escolha3 = Ler.umInt();
       
        switch(escolha3){       // Sub-menu Contas
            case 1: // Inserir conta        FALTA DIVIDIR PELAS PESSOAS
                System.out.println("Valor da conta : ");
                valor = Ler.umDouble();
                System.out.println("Descrição da conta : ");
                s = Ler.umaString();
                // Variavel com numero de pessoas
                // Set valor para cada pessoa : valor/nºpessoas
                Contas cont = new Contas(valor, s);
                contasPagar.add(cont);   
                break;
            case 2: // Remover conta pagar -> passar para conta (manter histórico)
                System.out.println("Escreva ID : ");  
                valor = Ler.umInt();            
                for(Contas e : contasPagar) {
                        if (e.getID() == valor) {
                           double hold = e.getValor();  // Obter valor e descrição para criar nova conta
                           String h = e.getDescricao();
                           Contas cont2 = new Contas(hold,h);
                           contasHist.add(cont2);       // Passar conta a pagar para histórico de contas
                           contasPagar.remove(e);       // Remover do array contas a pagar
                        }
                    }
                break;
            case 3: // Consultar Contas( a pagar e histórico)
                System.out.println("1. Contas a Pagar.\n2. Histórico de Contas");
                int escolha4 = 0;
                escolha4 = Ler.umInt();
                switch(escolha4){
                    case 1:
                       System.out.println("Contas: \n");
                       for(Contas e : contasPagar) {
                           e.toString();
                       }
                       break;
                    case 2:
                       System.out.println("Histórico de Contas: \n");
                       for(Contas e : contasHist) {
                           e.toString();
                       }
                       break;
                    default:
                        System.out.println("Opção não existente!!");
                        break;
                } 
                break;
            default:  
                System.out.println("Opção não existente!!");
                break;
            }
        
    }
      
    public void menuAdmin(){
        int escolha = 0;
        
        while(escolha != 4){       // Menu Inicial
            System.out.println("1 – Gestão Pessoas;\n" + "2 – Gestão Contas;\n" + "3 – Gestão Tarefas;\n" + "4 – Sair.\n");
            escolha = Ler.umInt();
        
            switch(escolha){
                case 1: 
                        menuGestaoPessoas();
                        break;
                case 2:
                    menuConta();
                    break;
                        
                case 4:
                    break;     // Sair do menu
                default:  
                    System.out.println("Opção não existente!!\n");
                    break;
            }            
        }
         public void menuTarefas() { /*Por fazer*/
            int escolha = 0;
            System.out.println("1 – Adicionar;\n" + "2 – Remover;\n" + "3 – Consultar;\n" + "4 – Sair.\n");
            escolha = Ler.umInt();
            while (true) {       // Menu Inicial
                switch (escolha) {
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
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
        }    
    }
}

