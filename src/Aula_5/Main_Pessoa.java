package Aula_5;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        Pessoa p1 = new Pessoa("Fabio", 52);
        p1.emprestar("Desventuras em serie");
        
        Pessoa p2 = new Pessoa("Joao", 33, "Star Wars", 30);
        p2.emprestar("Ensaio sobre a cegueira", 125);
        
        p.imprimir();
        p1.imprimir();
        p2.imprimir();
    }
}
