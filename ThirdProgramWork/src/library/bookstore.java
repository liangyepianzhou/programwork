package library;

import javax.swing.*;
import java.sql.SQLOutput;

public class bookstore {
    final  int  sumbook=3;
    static int left=1;
    String name;
    public void setName(String name) {
        this.name = name;
    }

    public bookstore() {
    }

    public static int getLeft() {
        return left;
    }

    public static void setLeft(int left) {
        bookstore.left = left;
    }
    public void lendbook()
    {
        synchronized (this)
        {
            if(left==0)
            {
                System.out.println("无书可借");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.notify();
            }
            else if(left>0&&left<=3){
                left--;
                System.out.println("剩余"+left+"本书");
                if(left==0){
                    System.out.println("已无书可借");
                }
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.notify();//提醒还书
            }
        }
    }
    public void  rebackbook()
    {
        synchronized (this)
        {
            if(left==3){
                System.out.println("无需还书");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               return;
            }
            else if(left<3&&left>=0)
            {
                left++;
                System.out.println("剩余"+left+"本书");

            }
        }

    }
}
