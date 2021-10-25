package com.ceep.test;

import com.ceep.dominio.Circulo;
import com.ceep.dominio.FiguraGeometrica;
import com.ceep.dominio.Rectangulo;

public class Test {
    
    public static void main(String[] args) {
        
        //Rectangulo
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
        
        //Circulo
        FiguraGeometrica figura2 = new Circulo("Circulo");
        figura2.dibujar();
        
    }
    
}
