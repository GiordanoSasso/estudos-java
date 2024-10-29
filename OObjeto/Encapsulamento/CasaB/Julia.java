package OObjeto.Encapsulamento.CasaB;

import OObjeto.Encapsulamento.CasaA.Ana;

public class Julia {

    void testeAcessos() {
        Ana sogra = new Ana();

        //ATRIBUTOS NÃO VISIVEIS
        //System.out.println(sogra.segredo);
        //System.out.println(sogra.facoDentroDeCasa);
        //System.out.println(sogra.formaDeFalar);

        //ATRIBUTO VISÍVEL
        System.out.println(sogra.todosSabem);
    }
    
}
