/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculamedia;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CalculaMedia {
private String nome;
private String turma; 
private String disciplina; 
private double tarefa; 
private double apostila; 
private double trabalho; 
private double tic; 
private double relatorio; 
private double avaliativas; 
private double trilhas; 
private double simulado; 
private double prova; 
private double media;    
public void recebeDados(String disciplina) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o nome do aluno: ");
    this.setNome(sc.nextLine());
    System.out.print("Digite a turma do aluno: ");
    this.setTurma(sc.nextLine());
    System.out.print("Digite a disciplina: ");
    this.setDisciplina(sc.nextLine());
    System.out.print("Digite a nota da tarefa: ");
    this.setTarefa(sc.nextDouble());
    System.out.print("Digite a nota da apostila: ");
    this.setApostila(sc.nextDouble());
    System.out.print("Digite a nota do trabalho: ");
    this.setTrabalho(sc.nextDouble());
    System.out.print("Digite a nota do TIC: ");
    this.setTic(sc.nextDouble());
    
    if( getDisciplina().equals("Prática")) {
        System.out.print("Digite a nota do relatório: ");
        this.setRelatorio(sc.nextDouble());
    } if(getDisciplina().equals("Teórica")) { 
        System.out.print("Digite a nota do relatório: "); 
        this.setRelatorio(sc.nextDouble()); 
    } 
    else { System.out.print("Digite a nota das trilhas: "); 
    this.setTrilhas(sc.nextDouble()); 
    System.out.print("Digite a nota das atividades avaliativas: "); 
    this.setAvaliativas(sc.nextDouble());    
    if(     getDisciplina().equals("Regular 3 ano")) {
        System.out.print("Digite a nota do simulado: ");
        this.setSimulado(sc.nextDouble());
    }
}

System.out.print("Digite a nota da prova: ");
this.setProva(sc.nextDouble());}
public void recebeDados(String nome,String turma,String disciplina,double tarefa,double apostila,double trabalho,double tic,double relatorio,double trilhas,double avaliativas,double simulado,double prova) { 
    this.setNome(nome); 
    this.setTurma(turma); 
    this.setDisciplina(disciplina); 
    this.setTarefa(tarefa); 
    this.setApostila(apostila); 
    this.setTrabalho(trabalho); 
    this.setTic(tic); 
    this.setRelatorio(relatorio); 
    this.setTrilhas(trilhas);
    this.setAvaliativas(avaliativas); 
    this.setSimulado(simulado); 
    this.setProva(prova); }
public double CalculaMedia() { 
    double media = 0;
    switch (getDisciplina()) {
        case "Pratica":
            media = (getTarefa() * 0.3) + (getApostila() * 0.05) + (getTrabalho() * 0.1) + (getTic() * 0.15)  + (getRelatorio() * 0.1) +  (getProva() * 0.3);
            break;
        case "Teorica":
            media = (getApostila() * 0.05) + (getTrabalho() * 0.1) + (getTic() * 0.15 ) + (getRelatorio() * 0.1) + (getProva() * 0.6);
            break;
        case "Regular":
            media = (getApostila() * 0.05) + (getTrabalho() * 0.1) + (getTrilhas() * 0.15) + (getAvaliativas() * 0.2) + (getProva() * 0.5);
            break;
        case "Regular 3° Ano":
            media = (getApostila() * 0.05) + (getTrabalho() * 0.1) + (getTrilhas() * 0.15) + (getAvaliativas() * 0.1) + (getSimulado() * 0.2) +(getProva() * 0.4);
            break;
        default:
            break;
    }

return media;
}

public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public double getTarefa() {
        return tarefa;
    }
    public void setTarefa(double tarefa) {
        this.tarefa = tarefa;
    }
    public double getApostila() {
        return apostila;
    }
    public void setApostila(double apostila) {
        this.apostila = apostila;
    }
    public double getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
    public double getTic() {
        return tic;
    }
    public void setTic(double tic) {
        this.tic = tic;
    }
    public double getRelatorio() {
        return relatorio;
    }
    public void setRelatorio(double relatorio) {
        this.relatorio = relatorio;
    }
    public double getAvaliativas() {
        return avaliativas;
    }
    public void setAvaliativas(double avaliativas) {
        this.avaliativas = avaliativas;
    }
    public double getTrilhas() {
        return trilhas;
    }
    public void setTrilhas(double trilhas) {
        this.trilhas = trilhas;
    }
    public double getSimulado() {
        return simulado;
    }
    public void setSimulado(double simulado) {
        this.simulado = simulado;
    }
    public double getProva() {
        return prova;
    }
    public void setProva(double prova) {
        this.prova = prova;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    
public void exibeDados() { 
    System.out.println("Nome do aluno: " + this.getNome()); 
    System.out.println("Turma: " + this.getTurma()); 
    System.out.println("Disciplina: " + this.getDisciplina()); 
    System.out.println("Media: " + this.CalculaMedia()); }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       CalculaMedia calcular = new CalculaMedia();

        System.out.println("Escolha a disciplina:");
        System.out.println("1 - Pratica");
        System.out.println("2 - Teorica");
        System.out.println("3 - Regular");
        System.out.println("4 - Regular 3 ano");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                calcular.recebeDados("Pratica");
                break;
            case 2:
                calcular.recebeDados("Teorica");
                break;
            case 3:
                calcular.recebeDados("Regular");
                break;
            case 4:
                calcular.recebeDados("Regular 3 ano");
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        calcular.exibeDados();
    
    }
}
