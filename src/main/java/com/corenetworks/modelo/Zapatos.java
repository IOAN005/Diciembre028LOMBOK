package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Zapatos extends Ropa implements Serializable {
    private int tamanoTacon;

    public String cambiarTacon() {
        return "estan cambiando el tacon";

    }

    public Zapatos(double precio, String proveedor, int numPrendas, int tamanoTacon) {
        super(precio, proveedor, numPrendas);
        this.tamanoTacon = tamanoTacon;
    }
}
