package com.ifba;
import com.strategy.*;

public class Main {

    public static void main(String[] args) {
        IImpressora laser = new Laser();
        IImpressora colorida = new Colorida();
        IImpressora matricial = new Matricial();

        Impressora impressora1 = new Impressora(laser);
        Impressora impressora2 = new Impressora();

        //Imprimindo na impressora 1 = laser;
        impressora1.imprimir("texto");

        //Configurando impressora 2 = colorida
        impressora2.setTipo(colorida);
        impressora2.imprimir("imagem");

        //Configurando impressora 2 = matricial
        impressora2.setTipo(matricial);
        impressora2.imprimir("formulário contínuo");

        //Imprimindo na impressora 1 = colorida;
        impressora1.setTipo(colorida);
        impressora1.imprimir("papel timbrado");

        Impressora impressora3 = new Impressora(new Termica());
        impressora3.imprimir("cupom fiscal");

    }
}
