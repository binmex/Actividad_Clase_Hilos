public class runTerminal {
    public static void main(String[] args) {
        System.out.println("========== INICION ========");
        ExampleThread th1 = new ExampleThread("Hilo 1");
        ExampleThread th2 = new ExampleThread("Hilo 2");

        th1.start();
        th2.start();

        System.out.println("========= FIN =====");

        ExampleRunner r1 = new ExampleRunner("Hilo 1");
        ExampleRunner r2 = new ExampleRunner("Hilo 2");
        Thread run1 = new Thread(r1);
        Thread run2 = new Thread( r2);

        run1.start();
        run2.start();
    }
}
