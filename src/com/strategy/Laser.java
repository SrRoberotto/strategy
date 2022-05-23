package com.strategy;

public class Laser implements IImpressora{
    @Override
    public void imprimir(String nota) {
        System.out.printf("Imprimindo %s na impressora laser\n", nota);
    }
}
