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
public class Espaco {
    private int estado; // 1 - Limpo ; 0 -> Não limpo
    private ArrayList<String> historico;
    private ArrayList<Integer> data;
    private String nome;

    public Espaco (String nome){
        this.nome = nome;
        estado=0;
    }

    public String getNome() {
        return nome;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }
    public void setHistorico(int day,String conteudo) {
        this.historico.set(day, conteudo);
    }
    public ArrayList<Integer> getData(){
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }
    public void setData(int day,int estado) {
        this.data.set(day,estado);
    }
}
