package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LluviaTest {
    @Test
    public void testObtenerVolumen() {
        //fake para la clase CantidadLluvia
        ExternalVolumenService fakevolumen = new FakeExternalVolumenService();

        Lluvia volumenlluvia = new Lluvia(fakevolumen);
        double result = Lluvia.getCurrentVolumen();

        assertEquals(10, result);
    }
}


