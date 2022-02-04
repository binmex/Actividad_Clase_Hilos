import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleThread extends Thread {
    private final String labelThread;

    public ExampleThread (String labelThread){
        this.labelThread = labelThread;
    }

    @Override
    public void run(){
        for (int i = 1; i < 10; i++) {
            System.out.println(labelThread+"-->"+i);
            try {
                //sleep(500);
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(ExampleThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
