package Aula_10;

import java.util.ArrayList;

public class Main_Pessoa {
    public static void main(String[] args) {
        Professor p1 = new Professor("Fabio", "111", "A21");
        //System.out.println(p1.imprimir());
        
        Aluno a1 = new Aluno("Joao", "22222", "RA1");
        //System.out.println(a1.imprimir());
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(p1);
        lstPessoas.add(a1);
        
        for (Pessoa p : lstPessoas) {
            if (p instanceof Aluno) {
                System.out.println(p.imprimir());
            }
        }
        
    }
}
