package library;

public class rebackbook implements Runnable{
    bookstore bookstore;

    public rebackbook(library.bookstore bookstore) {
        this.bookstore = bookstore;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            bookstore.rebackbook();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
