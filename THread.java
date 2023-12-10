package fun;
// thread extends Thread
class NewThread extends Thread {
    Thread t;

    NewThread() {
        t = new Thread(this, "demo");
        System.out.println(t.getName());
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted");
        }
        System.out.println("child exiting");
    }
}

public class THread{
    public static void main(String[] args) {
        new NewThread();
        try {


            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main interrupted");
        }

        System.out.println("main exiting");
    }
}