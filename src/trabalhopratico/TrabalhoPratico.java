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
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pessoa> membros = new ArrayList<Pessoa> ();
        
        for (int i = 0; i < Pessoa.getNum(); i++)
        {
            System.out.println(membros.get(i).getNota());
        }
        
        //-------------------------------------------------------//
        int sair = 0;
        int escolha;
        do
        {
            System.out.println("1 - Menu Admin");
            System.out.println("2 - Consultar Contas a pagar");
            System.out.println("3 - Consultar Tarefas");
            System.out.println("4 - Sair");
            
            escolha = Ler.umInt();
            
            switch(escolha)
            {
                case '1' : ;
                    
                case '2' : ;
                
                case '3' : ;
                
                case '4' :
                                sair = 1;
                                // gravar no ficheiro//
            }
            
        }
        while(sair == 0);
        
    }
    
    public void Menu(){
        /* 1- Mostrar Notificações
           2- Consultar Contas a pagar/Histórico de contas
           3- Consultar Tarefas
           4- Menu Admin (necessita de verificação de password)
        */
        
    }
}
