package org.example;

public class Viento {
    private static double velocidad; // valor de la velocidad del viento
    // Nuevo constructor de la clase Viento
    public Viento(double velocidad) {
        this.velocidad = velocidad;
    }
    private static ExternalVelocidadService externalvelocidad;
    //atributo de la clase viento
    //constructor de la clase viento
    public Viento(ExternalVelocidadService externalvelocidad) {

        this.externalvelocidad = externalvelocidad;
    }
    //metodo para obtener la velocidad del viento
    public static double getCurrentVelocidad() {
        if(externalvelocidad != null) {
            return externalvelocidad.getVelocidad();
        }
        else {
            return velocidad;
        }
    }
}
