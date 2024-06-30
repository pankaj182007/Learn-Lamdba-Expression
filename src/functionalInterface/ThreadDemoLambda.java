package functionalInterface;

public class ThreadDemoLambda {
    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            int a = 2;
            System.out.println("Table of " + a);
            for (int i = 1; i <= 10; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(2 + "x" + i + "=" + a * i);
            }
        };
        Thread t1 = new Thread(runnable1);
        t1.start();

        Runnable runnable2=()->{
            int a = 3;
            System.out.println("Table of " + a);
            for (int i = 1; i <= 10; i++) {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(2 + "x" + i + "=" + a * i);
            }

        };
        Thread t2=new Thread(runnable2);
        t2.start();
    }
}