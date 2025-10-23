package Aula_7;



// FUNCIONARIO
// - nome: String
// - ArrayList<Funcionario> lstSubordinados
//=======================
// + gets... sets...
// + addFuncionario(Funcionario func)
// + imprimir() - imprime os dados do funcionario e
// + imprimirSubordinados()- imprime a lista de subordinados






import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private ArrayList<Funcionario> lstSubordinados;
    
    public Funcionario(String nome) {
        this.nome = nome;
        lstSubordinados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addSubordinado(Funcionario func) {
        lstSubordinados.add(func);
    }
    
    public void imprimirSubordinados() {
        for (Funcionario f : lstSubordinados) {
            System.out.println(f.getNome());
        }
    }
    
    public void imprimir() {
        System.out.println("Nome: "+nome);
    }
}
