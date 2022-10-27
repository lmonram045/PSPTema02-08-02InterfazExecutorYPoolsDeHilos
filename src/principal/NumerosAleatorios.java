package principal;

import java.util.Random;

public class NumerosAleatorios implements Runnable {

    /**
     *  Compone una cadena de diez números aleatorios menores que 50, separados por ','.
     */
    public void run() {
        String strReturn = "";
        Random random = new Random(); // Generador de números aleatorios

        for (int i = 0; i < 10; i++) {
            strReturn += random.nextInt(50) + ","; // Genera un número aleatorio menor que 50.
            Thread.yield(); // Hace que el hilo actual se suspenda y permita que otros se ejecuten.
        }

        System.out.println("Números obtenidos por " + Thread.currentThread().getName() + ": " + strReturn);
    }
}
