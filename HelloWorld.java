public final class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        start();
        sageHallo();
    }

    public static void start() {
        System.out.println("I am a new method!");
    }

    /**
     * This method prints Hallo to the standard output
     */
    public static void sageHallo() {
        System.out.println("Hallo!");
    }
}
