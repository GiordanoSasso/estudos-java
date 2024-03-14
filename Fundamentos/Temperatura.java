package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        //( F - 32) x 5/9 = C
        final double Ajuste = 32;
        final double Fator = 5.0 / 9;
        double f = 86;
        double c = (f - Ajuste) * Fator ;
        
        System.out.println("A temperatura em Celsius é " + c);
    }
}
