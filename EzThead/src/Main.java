public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("A");
        NumberGenerator num2 = new NumberGenerator("B");
        NumberGenerator num3 = new NumberGenerator("C");
        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);
        Thread t3 = new Thread(num3);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t1.start();
        t3.start();
    }
}