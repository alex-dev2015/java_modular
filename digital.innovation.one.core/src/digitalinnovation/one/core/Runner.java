package digitalinnovation.one.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(15,3));

        System.out.println(calculadora.mult(3, 75));
    }
}
