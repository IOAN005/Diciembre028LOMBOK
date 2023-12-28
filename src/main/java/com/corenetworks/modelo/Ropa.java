package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data

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


}

