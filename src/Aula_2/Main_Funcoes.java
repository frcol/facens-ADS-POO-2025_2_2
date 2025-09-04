package Aula_2;

public class Main_Funcoes {
    public static void main(String[] args) { 
        String result = enviarEmail("Meu assunto novo");
        System.out.println(result);
        
        result = enviarEmail("\nOutro assunto");
        System.out.println(result);
    }
    
    public static String enviarEmail(String assunto) {
        String destinatario = "fabio.colombini@facens.br";
        String remetente = "eliney@facens.br";
        String corpo = "Ola, deu tudo certo";
        String email = assunto+
                "\n"+destinatario+
                "\n"+remetente+
                "\n"+corpo;
        
        return email;
    }
}