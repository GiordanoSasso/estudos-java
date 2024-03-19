package Classe;

public class Data {
    int dia;
    int mes;
    int ano;


    Data() {
       // dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);
    }
//para funções que não são estáticas,posso fazer o uso do THIS para chamar o método.
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, mes, ano);
    }/*exemplo de veriável local,
    funciona somente dentro do método
    que se encontra */
}
