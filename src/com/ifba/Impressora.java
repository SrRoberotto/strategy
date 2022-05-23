package com.ifba;

import com.strategy.IImpressora;

public class Impressora {
    private IImpressora impressora;

    Impressora(IImpressora t){
        this.impressora =t;
    }

    Impressora (){}

    public IImpressora getTipo() {
        return impressora;
    }

    public void setTipo(IImpressora tipo) {
        this.impressora = tipo;
    }

    void imprimir (String str){
        impressora.imprimir(str);
    }
}
