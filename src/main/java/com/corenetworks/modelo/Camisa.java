package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Camisa extends Ropa implements Serializable {
    private boolean corta;
    private double tallaCuello;
    public String destenir (){
        return  "entan deteniendo";

    }

    public Camisa(double precio, String proveedor, int numPrendas, boolean corta, double tallaCuello) {
        super(precio, proveedor, numPrendas);
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }
}
