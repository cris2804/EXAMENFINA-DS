package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TemperaturaTest {
    @Test
    public void testObtenerTemperatura() {
        //fake para la clase Temperatura
        ExternalTemperaturaService faketemperatura = new FakeExternalTemperaturaService();
        //variable real para la clase temperatura
        Temperatura temperatura = new Temperatura(faketemperatura);
        double result = Temperatura.getCurrentTemperatura(); //obtiene la temperatura

        assertEquals(20, result);
    }
}