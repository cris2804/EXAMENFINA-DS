package org.example;

import java.util.Scanner;

public class Clima {
    private Temperatura temperatura; // temperatura actual
    private Lluvia lluvia; // lluvia actual
    private Viento viento; //viento actual

    // Constructor de los campos de temperatura, lluvia y viento
    public Clima(Temperatura temperatura, Lluvia lluvia, Viento viento) {
        this.temperatura = temperatura;
        this.lluvia = lluvia;
        this.viento = viento;
    }

    // Método que evalúa las condiciones climáticas y genera alertas según ciertas condiciiones
    public String evaluarCondiciones() {
        StringBuilder eventos = new StringBuilder();

        // Generar alerta si el volumen de lluvia es mayor a 50
        if (Lluvia.getCurrentVolumen() > 50) {
            eventos.append("Alerta de Lluvia Intensa\n");
        }

        // Generar alerta si la velocidad del viento es mayor a 80
        if (Viento.getCurrentVelocidad() > 80) {
            eventos.append("Alerta de Viento Fuerte\n");
        }

        // Generar alerta si la temperatura es mayor a 30
        if (Temperatura.getCurrentTemperatura() > 30) {
            eventos.append("Activar Sistema de Riego\n");
        }

        // Si no se generaron alertas, indicar que no se requieren acciones
        if (eventos.length() == 0) {
            eventos.append("No se requieren acciones\n");
        }

        return eventos.toString(); // Devolver las alertas generadas en formato de cadena
    }
    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la temperatura (°C): ");
        double temperaturaValor = scanner.nextDouble();

        System.out.print("Ingrese el volumen de lluvia (mm): ");
        double lluviaValor = scanner.nextDouble();

        System.out.print("Ingrese la velocidad del viento (km/h): ");
        double vientoValor = scanner.nextDouble();

        // Crear instancias de Temperatura, Lluvia y Viento con los valores ingresados
        Temperatura temperatura = new Temperatura(temperaturaValor);
        Lluvia lluvia = new Lluvia(lluviaValor);
        Viento viento = new Viento(vientoValor);

        // Crear una instancia de Clima
        Clima clima = new Clima(temperatura, lluvia, viento);

        // Evaluar las condiciones y generar el reporte
        String reporte = clima.evaluarCondiciones();

        // Mostrar el reporte
        System.out.println("\nReporte de Condiciones Climáticas:");
        System.out.println(reporte);
    }
}