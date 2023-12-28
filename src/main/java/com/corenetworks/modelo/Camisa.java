package com.corenetworks.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Camisa extends Ropa implements Serializable {
    private boolean corta;
    private double tallaCuello;
    public String destenir (){
        return  "entan deteniendo";

    }

    @Override
    public String toString() {
        return "Camisa{" +
                "corta=" + corta +
                ", tallaCuello=" + tallaCuello +
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
        Camisa camisa = (Camisa) o;
        return corta == camisa.corta && Double.compare(tallaCuello, camisa.tallaCuello) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), corta, tallaCuello);
    }

    public Camisa() {
    }

    public Camisa(boolean corta, double tallaCuello) {
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }

    public Camisa(double precio, String proveedor, int numPrendas) {
        super(precio, proveedor, numPrendas);
    }

    public boolean isCorta() {
        return corta;
    }

    public void setCorta(boolean corta) {
        this.corta = corta;
    }

    public double getTallaCuello() {
        return tallaCuello;
    }

    public void setTallaCuello(double tallaCuello) {
        this.tallaCuello = tallaCuello;
    }
}
