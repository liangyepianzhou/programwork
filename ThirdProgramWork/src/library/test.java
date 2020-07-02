package library;

public class test {
    public static void main(String[] args) {
        bookstore bs=new bookstore();
        //五个来还书的人
        Thread f1=new Thread(new rebackbook(bs));
        Thread f2=new Thread(new rebackbook(bs));
        Thread f3=new Thread(new rebackbook(bs));
        Thread f4=new Thread(new rebackbook(bs));
        Thread f5=new Thread(new rebackbook(bs));
        //五个来借书的人
        Thread r1=new Thread(new lendbook(bs));
        Thread r2=new Thread(new lendbook(bs));
        Thread r3=new Thread(new lendbook(bs));
        Thread r4=new Thread(new lendbook(bs));
        Thread r5=new Thread(new lendbook(bs));
        //开启还书线程
        f1.start();
        f2.start();
        f3.start();
        f4.start();
        f5.start();
        //开启借书线程
        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();

    }
}
