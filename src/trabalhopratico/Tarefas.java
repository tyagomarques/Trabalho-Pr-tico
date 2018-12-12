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
public class Tarefas {
    private ArrayList<Espaco> task = new ArrayList<Espaco>();   /*Espaços de combate, não vale sair das barreiras!!!*/
    /*Basicamente espaços que serão realmente usados para limpar*/
    private ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>(); /*Pessoas que participam nas limpezas*/
    private static int taskultimo = 0, pessoaultimo = 0;
    /*O que falta:
    *
    * armazene o histórico de tarefas
    * mecher com a maravilhosa data
    * criar o "Já Limpei a cozinha"
    *
    * PS: Este teste somente vai para 1 pessoa para cada divisão
    * se querem 2 pessoas para 1 divisão no espaço precisam
    * de multiplicar pelo menos o nome do espaço
    * para o sorteiro sortear 2 pessoas
    * incluido O caso de declarar que são 2 pessoas para limpar a casa de banho
    * e calhar 2 vezes a mesma pois já faz uma verificação de repetição
    * */
    public void addTarefa(Espaco o) {           /*Quem está pronto para um novo desafio?*/
        taskultimo++;
        task.add(o);
    }

    public void removeTarefa(String nome) {         /*Não quero limpar a cozinha, é muito oleosa*/
        for (int i = 0; i < task.size(); i++) {
            if (nome.equals(task.get(i).getNome())) ;
            task.remove(i);
        }
    }

    public void addPessoa(Pessoa o) {   /*Adicionar candidato a limpar a casa de banho :D*/
        pessoaultimo++;
        pessoa.add(o);
    }

    public void setPessoa(ArrayList<Pessoa> o) { /*Adicionar candidatos "anteriores" */
        pessoaultimo = o.size();
        pessoa.clear();
        for (int i = 0; i < o.size(); i++) {
            pessoa.add(o.get(i));
        }
    }

    public void randomTarefas() {     /*Rodem os dados, a batalha vai começar!!!*/
        int tasks, i, tenta, max = 1,tentar;
        Pessoa e = this.pessoa.get(0);
        for (i = 0; i < pessoaultimo; i++) {
            e = this.pessoa.get(i);
            e.setTasks(null);
            e.setNtask(0);
            this.pessoa.set(i, e);
        }
        if (e != null) {
            e.setSucessos(0);
        }
        tenta = 4 * pessoaultimo; /*Acho um bom numero de tentativas para conseguir pelo menos 1 vez*/
        for (i = 0; i < taskultimo; i++) {
            tentar = tenta; /*Evitar fazer contas again and again*/
            do {
                tasks = (int) Math.random() * pessoaultimo; /*Sorteia a pessoa, vais ser tu a lavar a louça?*/
                tentar--; /*Por coveniência, evitar loops infinitos*/
            }
            while (this.pessoa.get(tasks).foundTasks(task.get(tasks).getNome()) || tentar != 0 || max >= (pessoa.get(i).getSucessos() / pessoaultimo));
                    if(max < (pessoa.get(i).getSucessos() / pessoaultimo))
                        max++; /*Agora tens mais 1 coisa para fazeres, que tristeza!! D:*/
                    if(tentar==0){
                        /*Help? Que erro deveria colocar cá?*/
                    }
                    e.setSucessos();
                    e=pessoa.get(i);
                    e.addTasks(this.task.get(i));

            /*Classe incompleta e com possibilidade da existência bugs, convêm dar uma olhadela*/
        }
    }
}
