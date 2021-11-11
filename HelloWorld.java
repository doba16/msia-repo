
public final class HelloWorld {
    
    public static void main(final String[] args) {
        System.out.println("Hello World");
        start();
    }

    /**
     * Gibt den Text "I am a new method!" aus.
     */
    public static void start() {
        System.out.println("I am a new method!");
        sageHallo();
    }

    /**
     * Schreibt eine Begrüßung in die Standard-Ausgabe.
     */
    public static void sageHallo() {
        System.out.println("Hallo!");
    }
}
