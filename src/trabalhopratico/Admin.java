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
      
    public void menu(){
        int escolha = 0;
        System.out.println("1 – Gestão Pessoas;\n" + "2 – Gestão Contas;\n" + "3 – Gestão Tarefas;\n" + "4 – Sair.\n");
        escolha = Ler.umInt();
        while(escolha != 4){       // Menu Inicial
            switch(escolha){
                case 1: 
                    
                    break;
                case 2:
                    
                    break;
                        
                case 5:
                    break;
                
            }
            System.out.println("Opção : ");
            escolha = Ler.umInt();
        }
    }
}
