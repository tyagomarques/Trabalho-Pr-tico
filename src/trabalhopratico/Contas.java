/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;
import java.util.ArrayList;
/**
 *
 * @author Diogo Pinheiro
 */
public class Contas {
    /*-------------------------------------- */
    private double valor ;
    private String descricao;
    private static int ID;
    
    public Contas(double valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
        ID = ID++;
    }
    /*-------------------------------------- */
}
