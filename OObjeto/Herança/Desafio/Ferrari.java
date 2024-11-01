package OObjeto.Herança.Desafio;

public class Ferrari extends Carro {
     
    public Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 350;
    }
    //void acelerar() {
      //  super.acelerar();
    //}
    
}
