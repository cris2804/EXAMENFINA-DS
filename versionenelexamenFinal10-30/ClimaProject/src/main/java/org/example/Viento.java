package org.example;

public class Viento {
    private static ExternalVelocidadService externalvelocidad;
    //atributo de la clase viento
    ////constructor de la clase viento
    public Viento(ExternalVelocidadService externalvelocidad) {

        this.externalvelocidad = externalvelocidad;
    }
    //metodo para obtener la velocidad del viento
    public static double getCurrentVelocidad() {
        return externalvelocidad.getVelocidad();
    }
}
