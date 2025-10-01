package Aula_6;

import Aula_5.*;

public class Pessoa {
    private String nome;
    private int idade;
    private String livro;
    private int diasDevolucao;
    
    public Pessoa() {
        
    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, String livro, int dias) {
        this.nome = nome;
        this.idade = idade;
        this.livro = livro;
        this.diasDevolucao = dias;
    }
    
    public void emprestar(String livro) {
        this.livro = livro;
        this.diasDevolucao = 20;
    }
    
    public void emprestar(String livro, int dias) {
        this.livro = livro;
        this.diasDevolucao = dias   ;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
        
    }
    public void imprimir() {
        String msg = "\n====================="
                    +"\nNome: "+nome
                    +"\nIdade: "+idade
                    +"\nLivro: "+livro
                    +"\nDias: "+diasDevolucao
                    +"\n=====================";
        System.out.println(msg);
    }
} 
