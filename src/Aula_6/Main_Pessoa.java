package Aula_6;

import java.util.ArrayList;
import java.util.Scanner;


public class Main_Pessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        Pessoa pe = null;
        int count = 0;
        
        do {
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();

            pe = new Pessoa(nome, idade);
            lstPessoas.add(pe);
            count++;
        } while (count < 3);
        
        // remover um elemento
        lstPessoas.remove(1);
        
        for (Pessoa p : lstPessoas) {
            if (p.getIdade() == 52) {
                p.imprimir();
            }
        }
        
        for (Pessoa p : lstPessoas) {
            if (p.getNome().equalsIgnoreCase("Fabio")) {
                p.imprimir();
            }
        }
        
        for (Pessoa p : lstPessoas) {
            p.imprimir();
        }
    }

}
