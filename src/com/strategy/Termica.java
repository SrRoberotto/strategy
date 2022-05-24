package com.strategy;

public class Termica implements IImpressora{

    @Override
    public void imprimir(String nota) {
        System.out.printf("Imprimindo %s na impressora térmica\n", nota);
    }
}
