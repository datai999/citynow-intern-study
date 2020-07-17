package thread;

public class LuckySprin {

    private int count = 0;
    private boolean isStop = false;

//    @Override
    public void run() {
        while(!isStop) {
            System.out.println("Non-thread:" + count);
            try {
                Thread.sleep(500);
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
