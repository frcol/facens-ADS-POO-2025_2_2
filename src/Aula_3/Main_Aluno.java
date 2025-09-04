package Aula_3;

import java.util.Scanner;

public class Main_Aluno {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        Aluno aluno1 = new Aluno();
        
        a.setRa("11111");
        a.setNome("Fabio");
        a.setCurso("ADS");
        
        b.setRa("2222");
        b.setNome("Maria");
        b.setCurso("Alimentos");
        
        System.out.println(a.getRa());
        System.out.println(b.getNome());
        System.out.println(aluno1.getNome());
    }
}
