package org.example;

public class Lluvia {
 private static ExternalVolumenService externalvolumen; //atributo de la clase CantidadLluvia
////constructor de la clase Lluvia
    public Lluvia(ExternalVolumenService externalvolumen) {
        this.externalvolumen = externalvolumen;
    }
//metodo para obtener el volumen de la lluvia
    public static double getCurrentVolumen() {
        return externalvolumen.getVolumen();
    }
}
