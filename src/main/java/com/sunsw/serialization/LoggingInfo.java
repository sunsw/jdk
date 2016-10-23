package com.sunsw.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Sucre on 16/10/22.
 */
public class LoggingInfo implements Serializable {
    private Date loggingDate = new Date();
    private String uid;
    private transient String pwd;

    LoggingInfo(String uid, String password) {
        uid = uid;
        pwd = password;
    }

    public static void main(String[] args) {
        LoggingInfo logInfo = new LoggingInfo("MIKE", "MECHANICS");
        System.out.println(logInfo.toString());
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("logInfo.out"));
            o.writeObject(logInfo);
            o.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("logInfo.out"));
            LoggingInfo logInfo1 = (LoggingInfo) in.readObject();
            System.out.println(logInfo1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String password = null;
        if (pwd == null) {
            password = "NOT SET";
        } else {
            password = pwd;
        }
        return "logon info: \n   " + "user: " + uid +
                "\n   logging date : " + loggingDate.toString() +
                "\n   password: " + password;
    }
}