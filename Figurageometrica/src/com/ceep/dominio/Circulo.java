package com.ceep.dominio;

public class Circulo extends FiguraGeometrica{

    //Constructor
    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    //Metodo
    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + getClass().getSimpleName());
    }
    
}
