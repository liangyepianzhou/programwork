package library;

public class lendbook  implements Runnable{
    bookstore bookstore;

    public lendbook(library.bookstore bookstore) {
        this.bookstore = bookstore;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            bookstore.lendbook();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
