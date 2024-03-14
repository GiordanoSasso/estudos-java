package Classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(26, 6, 1995);
        
        var d2 = new Data();
        

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
