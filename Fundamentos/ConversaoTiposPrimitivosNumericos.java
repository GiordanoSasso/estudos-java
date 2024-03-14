package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1;//conversão implícita
        System.out.println(a);

        float b = (float)1.1234567890999;
        System.out.println(b);//conversão explícita(CAST)

        int c = 128;
        byte d = (byte) c;
        System.out.println(d);//conversão explícita(CAST)

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);//conversão explícita(CAST)
    }
}
