package org.example;

public class Temperatura {
    private static ExternalTemperaturaService externaltemperatura; //atributo de la clase CantidadLluvia
    //constructor de la clase Temperatura
    public Temperatura(ExternalTemperaturaService externaltemperatura) {

        this.externaltemperatura = externaltemperatura;
    }
    //metodo para obtener la temperatura en celsius
    public static double getCurrentTemperatura() {
        return externaltemperatura.getTemperatura();
    }
}
