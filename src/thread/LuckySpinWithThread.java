package thread;

public class LuckySpinWithThread extends Thread{

    private int count = 0;
    private boolean isStop = false;

    @Override
    public void run() {
        while(!isStop) {
            System.out.println("Thread:" + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            if (count > 10) {
                isStop = true;
            }
        }
    }
}
