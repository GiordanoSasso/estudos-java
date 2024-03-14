package EstruturasDeControle;

public class DesafioFor {
    public static void main(String[] args) {
        
        for(String i = "#"; !i.equals("######"); i += "#") {
            System.out.println(i);
        }
    }
}
//Não pode usar valor numérico pra controlar o laço!