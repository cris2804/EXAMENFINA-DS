package org.example;

public class FakeExternalTemperaturaService extends ExternalTemperaturaService {

    @Override
    public double getTemperatura() {
        return 20;
    }
}
