package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pantalon extends Ropa implements Serializable {
    private String tipoPantalon;
    public String desmontar(){
        return "estan desmontando";

    }

    public Pantalon(double precio, String proveedor, int numPrendas, String tipoPantalon) {
        super(precio, proveedor, numPrendas);
        this.tipoPantalon = tipoPantalon;
    }


}
