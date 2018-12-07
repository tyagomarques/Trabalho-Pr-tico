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
public class Pessoa {
    private String nome;
    private String pass;
    private ArrayList<Tarefas> tasks;
    private ArrayList<Contas> contas;

    private Pessoa(){ 
    }
    
    private Pessoa(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Tarefas> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Tarefas> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Contas> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Contas> contas) {
        this.contas = contas;
    }
    
        
}
