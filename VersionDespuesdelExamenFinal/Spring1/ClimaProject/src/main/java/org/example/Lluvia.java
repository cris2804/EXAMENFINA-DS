package org.example;

public class Lluvia {
    private static double volumen; // valor del volumen de lluvia

    //Nuevo Constructor de la clase Lluvia
     Lluvia(double volumen) {
        Lluvia.volumen = volumen;
    }

     private static ExternalVolumenService externalvolumen; //atributo de la clase CantidadLluvia
    //constructor fake de la clase Lluvia
         Lluvia(ExternalVolumenService externalvolumen) {
            Lluvia.externalvolumen = externalvolumen;
        }
    //metodo para obtener el volumen de la lluvia
        public static double getCurrentVolumen() {
            if(externalvolumen != null){ // si el atributo es de clase fake
                return externalvolumen.getVolumen(); }
            else { // si el atributo es de clase real
                return volumen;
            }

        }
}
