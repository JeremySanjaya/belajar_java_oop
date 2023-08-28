package progammer.zaman.now.application;

import progammer.zaman.now.error.DatabaseError;

import javax.xml.crypto.Data;

public class DatanbaseApp {
    public static void main(String[] args) {
        connectDatabase("Jeremy", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
