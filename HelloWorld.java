public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        start();
        sageHallo();
    }

    /**
     * Gibt den Text "I am a new method!" aus.
     */
    public static void start() {
        System.out.println("I am a new method!");
    }

    /**
     * Gibt die Zeile "Hallo!" auf Stdout aus.
     */
    public static void sageHallo() {
        System.out.println("Hallo!");
    }
}
