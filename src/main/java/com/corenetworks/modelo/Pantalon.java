package com.corenetworks.modelo;

import java.io.Serializable;

public class Pantalon extends Ropa implements Serializable {
    private String tipoPantalon;
    public String desmontar(){
        return "estan desmontando";

    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "tipoPantalon='" + tipoPantalon + '\'' +
                ", precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                ", numPrendas=" + numPrendas +
                '}';
    }

    public Pantalon() {
    }

    public Pantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }

    public Pantalon(double precio, String proveedor, int numPrendas, String tipoPantalon) {
        super(precio, proveedor, numPrendas);
        this.tipoPantalon = tipoPantalon;
    }

    public String getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }
}
