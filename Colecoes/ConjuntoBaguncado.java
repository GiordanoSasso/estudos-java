package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);// double -> Double
        conjunto.add(true);//boolean -> Boolean
        conjunto.add("Teste");//String
        conjunto.add(1);//int -> Integer
        conjunto.add('x');


        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");//objeto duplicado não será contabilizado
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());
        //tamanho continua o mesmo até aqui.

        System.out.println(conjunto.remove("teste"));//não removerá nada
        System.out.println(conjunto.remove("Teste"));//remove objeto com o mesmo nome.
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));//removido na linha 26
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));
    
    
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);//união entre 2 conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
