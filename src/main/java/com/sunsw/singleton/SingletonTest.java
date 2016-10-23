package com.sunsw.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Sucre on 16/10/22.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton3 s3 = Singleton3.getInstance();
        System.out.println(s3.toString());
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("s3.out"));
            o.writeObject(s3);
            o.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("s3.out"));
            Singleton3 s30 = (Singleton3) in.readObject();
            System.out.println(s30.toString());
            System.out.println(s3 == s30);
            System.out.println(s3.equals(s30));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Singleton4 s4 = Singleton4.s0;
        System.out.println(s4.toString());
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("s4.out"));
            o.writeObject(s4);
            o.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("s4.out"));
            Singleton4 s40 = (Singleton4) in.readObject();
            System.out.println(s40.toString());
            System.out.println(s4 == s40);
            System.out.println(s4.equals(s40));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
