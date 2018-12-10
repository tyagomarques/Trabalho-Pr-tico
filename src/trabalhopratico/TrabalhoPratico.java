/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;

import java.util.ArrayList;
import myinputs.Ler;

import javax.swing.*;

/**
 *
 * @author tyagomarques
 */
public class TrabalhoPratico {
    private static String password,valor,nome;
    private static int escolha;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        ArrayList<Pessoa> membros = new ArrayList<>();
        try {
            for (int i = 0; i < Pessoa.getNum(); i++) {
                System.out.println(membros.get(i).getNota()); /* Lembrem-se que este aqui não devia estar cá mas sim no menu*/
                                                                /*E devem criar uma função que leia um ficheiro!!!*/
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Vazio\n");
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
                case '1' : break;

                case '2' : break;

                case '3' : break;

                case '4' : sair = 1;
                            break;
                                // gravar no ficheiro//
            }

        }
        while(sair == 0);
    }

    private static void menu(){
        /* 1- Mostrar Notificações
           2- Consultar Contas a pagar/Histórico de contas
           3- Consultar Tarefas
           4- Menu Admin (necessita de verificação de password)
        */

        JOptionPane.showMessageDialog(null,"Seja bem vindo à Gerência de Tarefas","Gerência de Tarefas",JOptionPane.INFORMATION_MESSAGE);
        do {
            escolha = 0;

            valor = JOptionPane.showInputDialog(null,
                    "0- Sair\n"+
                             "1- Mostrar Notificações\n" +
                             " 2- Consultar Contas a pagar/Histórico de contas\n" +
                             " 3- Consultar Tarefas\n" +
                             " 4- Menu Admin (necessita de verificação de password)\n" +
                             "Introduza um inteiro:","Gerência de Tarefas",JOptionPane.INFORMATION_MESSAGE);
            if (valor != null) {
                escolha = Integer.parseInt(valor);
                switch (escolha){
                    case 1:
                            break;
                    case 2:
                            break;
                    case 3:
                            break;
                    case 4: nome = JOptionPane.showInputDialog(null,"Nome:","Admin",JOptionPane.PLAIN_MESSAGE);
                            password = JOptionPane.showInputDialog(null,"Password: ","Admin",JOptionPane.PLAIN_MESSAGE);
                            break;
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Adeus!!","Gerência de Tarefas",JOptionPane.INFORMATION_MESSAGE);
            }
        } while(escolha==0);
        System.exit(0);
    }
}
