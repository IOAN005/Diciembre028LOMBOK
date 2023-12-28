package com.corenetworks.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Zapatos extends Ropa implements Serializable {
    private int tamanoTacon;
    public String cambiarTacon(){
        return "estan cambiando el tacon";

    }

    @Override
    public String toString() {
        return "Zapatos{" +
                "tamanoTacon=" + tamanoTacon +
                ", precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                ", numPrendas=" + numPrendas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Zapatos zapatos = (Zapatos) o;
        return tamanoTacon == zapatos.tamanoTacon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanoTacon);
    }

    public Zapatos() {
    }

    public Zapatos(int tamanoTacon) {
        this.tamanoTacon = tamanoTacon;
    }

    public Zapatos(double precio, String proveedor, int numPrendas) {
        super(precio, proveedor, numPrendas);
    }

    public int getTamanoTacon() {
        return tamanoTacon;
    }

    public void setTamanoTacon(int tamanoTacon) {
        this.tamanoTacon = tamanoTacon;
    }
}
