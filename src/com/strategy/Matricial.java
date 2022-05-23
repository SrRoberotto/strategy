package com.strategy;

public class Matricial implements IImpressora {

    @Override
    public void imprimir(String nota) {
        System.out.printf("Imprimindo %s na impressora matricial\n", nota);
    }
}
