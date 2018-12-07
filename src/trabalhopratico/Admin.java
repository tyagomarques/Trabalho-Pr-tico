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
    /* 1--------------------------------- */
    private ArrayList<Contas> contas;
    /* 1--------------------------------- */
   
    public Admin(String nome){
        super(nome);
        
    }
    
    public void insert(Pessoa a){
        pessoa.add(a);
    }
    
    /*2--------------------------------------- */
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
                System.out.println("Desc : ");  // Criar ID
                s = Ler.umaString();            
                            
                break;
            }
    }
    /*2---------------------------------- */
    
    public void menu(){
        System.out.println("1 – Gestão Pessoas;\n" + "2 – Gestão Contas;\n" + "3 – Gestão Tarefas;\n" + "4 – Remover."  + "5.Sair\n");
    }
        int escolha = Ler.umInt();
        while(escolha != 5){       // Menu Inicial
            switch(escolha){
                case 1: 
                    
                    break;
                case 2:
                    
                    break;
                        
                case 5:
                    return;
                
            }
            System.out.println("Opção : ");
            escolha = Ler.umInt();
    }
}
