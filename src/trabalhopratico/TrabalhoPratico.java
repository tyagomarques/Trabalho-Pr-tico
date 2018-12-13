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
            System.out.println("1 - Consultar Contas a pagar");
            System.out.println("2 - Consultar Tarefas");
            System.out.println("3 - Sair");
            if(a.getCategoria() == 1){
                System.out.println("A - Menu Admin");
            }
                        
            escolha = Ler.umInt();
            
            switch(escolha)
            {
                case '1' : break;
                    
                case '2' : break;
                
                case 'A' :
                    if(a.getCategoria() == 1){
                        a.menuAdmin();
                    }
                                
                                // gravar no ficheiro//
                                break;
            }
            
        }
        while(escolha != 4);   
    }
}
