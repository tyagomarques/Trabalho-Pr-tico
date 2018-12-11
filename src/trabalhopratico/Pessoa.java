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
    private static int num = 0;
    private String nome;
    private String pass;
    private ArrayList<Tarefas> tasks;
    private ArrayList<Contas> contasPagar;
    private ArrayList<Contas> contasHist;
    private String Nota;
    private int categoria; // 0 - Pessoa, 1 - Admin

    private Pessoa(){
    }
    
    public Pessoa(String nome){
        this.nome = nome;
        this.num++;
    }
    
    public Pessoa(Pessoa pessoa)
    {
        this.nome = pessoa.nome;
        this.pass = pessoa.pass;
        setTasks(pessoa.getTasks());
        setContas(pessoa.getContas());
        setContas(pessoa.getContasHist());
        Nota = pessoa.getNota();
        categoria = pessoa.getCategoria();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Tarefas> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Tarefas> tasks) {
        ArrayList<Tarefas> ntarefas = new ArrayList<Tarefas>();
        
        for(int i = 0; i < tasks.size(); i++)
        {
            ntarefas.add(tasks.get(i));
        }
        this.tasks = ntarefas;
    }

    public ArrayList<Contas> getContas() {
        return contasPagar;
    }

    public void setContas(ArrayList<Contas> contas) {
        ArrayList<Contas> nContas = new ArrayList<Contas>();
        
        for(int i = 0; i < contas.size(); i++)
        {
            nContas.add(contas.get(i));
        }
        this.contasPagar = nContas;
    }

    public ArrayList<Contas> getContasHist() {
        return contasHist;
    }

    public void setContasHist(ArrayList<Contas> contasHist) {
        ArrayList<Contas> nContasHist = new ArrayList<Contas>();
        
        for(int i = 0; i < contasHist.size(); i++)
        {
            nContasHist.add(contasHist.get(i));
        }
        this.contasHist = nContasHist;
    }
    
    public static int getNum() {
        return num;
    }


    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    
    public String getNota()
    {
        return (nome + "/n NOTA: /n" + Nota + "/n/n" );
    }
    
    public int getCategoria()
    {
        return categoria;
    }
    
    public void setCategoria(int valor)
    {
        categoria = valor;
    }
    
}
