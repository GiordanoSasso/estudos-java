package Fundamentos;

import java.util.Scanner;

public class tipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));
        //equal irá comparar o conteúdo sempre da variável

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.nextLine();
        System.out.println("2" == s2.trim());
        //TRIM tira os espaços em branco caso o usuário digite no teclado
        System.out.println("2".equals(s2.trim()));
    
        entrada.close();
    }
}
/*sempre usar Equals para comparação 
 * de strings
 */