package org.example;

public class FakeExternalVolumenService extends ExternalVolumenService {
    @Override
    public double getVolumen() {
        return 10; //volumen de la lluvia para hacer que la prueba pase
    }
}
