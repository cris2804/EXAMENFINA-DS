package org.example;

public class Temperatura {
    private static double temperatura; // valor de la temperatura

    //Nuevo Constructor de la clase Temperatura
    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    private static ExternalTemperaturaService externaltemperatura; //atributo de la clase CantidadLluvia
    //constructor de la clase Temperatura usando la clas ExternalTemperaturaService
    public Temperatura(ExternalTemperaturaService externaltemperatura) {

        this.externaltemperatura = externaltemperatura;
    }
    //metodo para obtener la temperatura en celsius
    public static double getCurrentTemperatura() {
        if(externaltemperatura != null){ // si el atributo es de clase fake
            return externaltemperatura.getTemperatura(); }
        else { // si el atributo es de clase real
            return temperatura;
        }

    }
}
