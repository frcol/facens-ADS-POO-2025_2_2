package Aula_7;

public class Main_Func {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao");
        Funcionario f2 = new Funcionario("geremte Maria");
        
        Funcionario f3 = new Funcionario("Gerente geral Marcos");
        
        f3.addSubordinado(f1);
        f3.addSubordinado(f2);
    }
}
