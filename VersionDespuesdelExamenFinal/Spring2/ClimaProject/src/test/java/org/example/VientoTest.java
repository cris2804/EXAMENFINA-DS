package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VientoTest {
    @Test
    public void testObtenerVelocidadViento() {
        //fake para la clase viento
        ExternalVelocidadService fakevelocidad = new FakeExternalVelocidadService();

        Viento velocidadviento = new Viento(fakevelocidad);
        double result = Viento.getCurrentVelocidad();//obtiene la velocidad

        assertEquals(5, result);//compara la velocidad del viento
    }

}