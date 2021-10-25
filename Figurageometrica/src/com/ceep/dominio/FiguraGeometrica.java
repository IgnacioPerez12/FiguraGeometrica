package com.ceep.dominio;

public abstract class FiguraGeometrica {
    
    private String tipoFigura; 

    //Constructor
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //Getter and Setter
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //Metodos
    public abstract void dibujar();
}
