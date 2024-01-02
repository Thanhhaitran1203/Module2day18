public class Mythread extends Thread {
    private String name;

    public Mythread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(name+" "+i);
        }
    }
    public static void main(String[] args) {
        Mythread t1 = new Mythread("thang");
        Mythread t2 = new Mythread("phong");
        Mythread t3 = new Mythread("hung");
        t2.start();
        t1.start();
        t3.start();
    }
}