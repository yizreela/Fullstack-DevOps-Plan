/**
 * Ejercicio de sintaxis básica de Java
 * Incluye: variables, bucles, condicionales, métodos, clases y arrays
 * 
 * @author Yizreel
 * @version 1.0
 */
public class Main {
    
    // Constantes
    private static final int MAX_ITERACIONES = 5;
    private static final String MENSAJE_BIENVENIDA = "¡Hola y bienvenido, %s!";

    /**
     * Método que suma dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return suma de a y b
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        //1. Variables y tipos de datos
        int edad = 29;
        double peso = 70.99;
        String nombre = "Yizreel";
        boolean esMasculino = false;
        String mensaje = "";

        //2. Loops For y While
        for (int i = 1; i <= MAX_ITERACIONES; i++) {

            //4. Condicionales
            if (esMasculino) {
                mensaje = String.format("¡Hola y bienvenido, %s! Tienes %d años y tu sexo es hombre", nombre, edad);
            } else {
                mensaje = String.format("¡Hola y bienvenido, %s! Tienes %d años y tu sexo es mujer", nombre, edad);
            }
            System.out.println(mensaje);

            int suma = suma(i, i);
            System.out.println(suma);
            System.out.println(mensaje.length());
            System.out.println(edad + "-" + suma + "-" + Math.max(edad, suma));
        }

        int j = 0;
        while (j < MAX_ITERACIONES) {
            if (esMasculino) {
                mensaje = String.format("¡Hola y bienvenido, %s! Tienes %d años y tu sexo es hombre, con un peso de %.1f", nombre, edad, peso);
            } else {
                mensaje = String.format("¡Hola y bienvenido, %s! Tienes %d años y tu sexo es mujer, con un peso de %.1f", nombre, edad, peso);
            }
            System.out.println(mensaje);

            Persona p = new Persona(nombre,edad + j);
            p.saludar();

            j++;
        }
    }
}

/**
 * Clase que representa una persona
 * Demuestra conceptos de POO: encapsulación, constructores y métodos
 */
class Persona {
    // Atributos privados (encapsulación)
    private String nombre;
    private int edad;
    private String[] frutas;

    /**
     * Constructor de la clase Persona
     * @param nombre nombre de la persona
     * @param edad edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.frutas = new String[]{"Manzana", "Banana", "Uva"};
    }

    /**
     * Getter para obtener el nombre
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter para obtener la edad
     * @return edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que imprime un saludo personalizado
     * Incluye información sobre las frutas favoritas
     */
    public void saludar() {
        String mensaje = String.format(
                "¡Hola soy %s comunicándome desde la clase, tengo %d años y me gustan estas frutas: %s.",
                nombre, edad, String.join(", ", frutas)
        );
        System.out.println(mensaje);
    }
}