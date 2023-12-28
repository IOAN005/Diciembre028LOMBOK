package com.corenetworks.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Ropa implements Serializable {
    protected double precio;
    protected String proveedor;
    protected  int numPrendas;

    public String probar() {
        return "estan probando";
    }
    public String desinfectar(){
        return "estan desinfectando";
    }
    public  String vender(){
        return "estan vendiendo";

    }

    @Override
    public String toString() {
        return "Ropa{" +
                "precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                ", numPrendas=" + numPrendas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ropa ropa = (Ropa) o;
        return Double.compare(precio, ropa.precio) == 0 && numPrendas == ropa.numPrendas && Objects.equals(proveedor, ropa.proveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, proveedor, numPrendas);
    }

    public Ropa() {
    }

    public Ropa(double precio, String proveedor, int numPrendas) {
        this.precio = precio;
        this.proveedor = proveedor;
        this.numPrendas = numPrendas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumPrendas() {
        return numPrendas;
    }

    public void setNumPrendas(int numPrendas) {
        this.numPrendas = numPrendas;
    }
}

