package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClimaTest {

    @Test
    public void testEvaluarCondicionesLluviaIntensa() {
        // Crear instancias de condiciones climáticas simuladas
        Temperatura temperatura0 = new Temperatura(20.0); // temperatura normal
        Lluvia lluvia0 = new Lluvia(60.0); // volumen alto de lluvia para simular lluvia intensa
        Viento viento0 = new Viento(10.0); // velocidad normal de viento

        // Crear instancia de la clase Clima
        Clima clima = new Clima(temperatura0, lluvia0, viento0);

        // Evaluar condiciones
        String result = clima.evaluarCondiciones();

        // Verificar resultados esperados
        assertEquals("Alerta de Lluvia Intensa\n", result);
    }

    @Test
    public void testEvaluarCondicionesVientoFuerte() {
        // Crear instancias de condiciones climáticas simuladas
        Temperatura temperatura1 = new Temperatura(20.0); // temperatura normal
        Lluvia lluvia1 = new Lluvia(10.0); // volumen normal de lluvia
        Viento viento1= new Viento(90.0); // velocidad alta de viento para simular viento fuerte

        // Crear instancia de la clase Clima
        Clima clima = new Clima(temperatura1, lluvia1, viento1);

        // Evaluar condiciones
        String result = clima.evaluarCondiciones();

        // Verificar resultados esperados
        assertEquals("Alerta de Viento Fuerte\n", result);
    }

    @Test
    public void testEvaluarCondicionesSistemaRiego() {
        // Crear instancias de condiciones climáticas simuladas
        Temperatura temperatura2 = new Temperatura(35.0); // temperatura alta para activar sistema de riego
        Lluvia lluvia2 = new Lluvia(10.0); // volumen normal de lluvia
        Viento viento2 = new Viento(10.0); // velocidad normal de viento

        // Crear instancia de la clase Clima
        Clima clima = new Clima(temperatura2, lluvia2, viento2);

        // Evaluar condiciones
        String result = clima.evaluarCondiciones();

        // Verificar resultados esperados
        assertEquals("Activar Sistema de Riego\n", result);
    }




}
