package principal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {

    /**
     * Ejecuta 8 veces la tarea NumerosAleatorios que imprime diez números aleatorios menores que 50, mediante un pool
     * de tan solo 2 hilos.
     */
    public static void main(String[] args) {
        // Crea un pool fijo de 2 hilos.
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Pasa 30 tareas NumerosAleatorios al pool de 2 hilos.
        for (int i = 0; i < 30; i++) {
            executor.execute(new NumerosAleatorios());
        }

        // Ordena la destrucción de los dos hilos del pool cuando hayan completado todas las tareas.
        executor.shutdown();
    }
}
