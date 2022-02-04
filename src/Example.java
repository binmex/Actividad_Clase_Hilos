import java.util.Calendar;

public class Example {
    public static void main(String[] args) {
        System.out.println("=====Begin=====");
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    Calendar dateAct = Calendar.getInstance();
                    int hour = dateAct.get(Calendar.HOUR);
                    int minutes = dateAct.get(Calendar.MINUTE);
                    int second = dateAct.get(Calendar.SECOND);
                    System.out.println(hour+":"+minutes+":"+second);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        System.out.println("========END0=======");
    }
}
