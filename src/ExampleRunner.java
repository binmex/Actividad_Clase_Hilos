import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleRunner implements Runnable {
    private final String label;

    public ExampleRunner(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(label + "-->" + i);
            try {
                //sleep(500);
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(ExampleRunner.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
