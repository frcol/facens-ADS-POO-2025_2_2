package Aula_6;

import java.util.ArrayList;

public class Main_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> lstNomes = new ArrayList<>();
        lstNomes.add("Fabio");
        lstNomes.add("Spider Man");
        lstNomes.add("Darth Vader");
        
        /*for (int i = 0; i < lstNomes.size(); i++) {
            System.out.println(lstNomes.get(i));
        }*/
        
        for (String n : lstNomes) {
            System.out.println(n);
        }
          
    }
}
