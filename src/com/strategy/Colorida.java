package com.strategy;

public class Colorida implements IImpressora{
    @Override
    public void imprimir(String nota) {
        System.out.printf("Imprimindo %s na impressora colorida\n", nota);
    }
}
