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
    private ArrayList<Contas> contasPagar;
    private ArrayList<Contas> contasHist;
   
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
            case 3: // Consultar Contas
                System.out.println("Contas: \n");
                for(Contas e : contasPagar) {
                        e.toString();
                }
                break;
            default:  
                System.out.println("Opção não existente!!");
                break;
            }
        
    }
      
    public void menu(){
        int escolha = 0;
        System.out.println("1 – Gestão Pessoas;\n" + "2 – Gestão Contas;\n" + "3 – Gestão Tarefas;\n" + "4 – Sair.\n");
        escolha = Ler.umInt();
        while(escolha != 4){       // Menu Inicial
            switch(escolha){
                case 1: 
                    
                    break;
                case 2:
                    menuConta();
                    break;
                        
                case 4:
                    break;
                default:  
                    System.out.println("Opção não existente!!");
                    break;
            }
                
            }
            System.out.println("Opção : ");
            escolha = Ler.umInt();
        }
    }
}
//--------------------------