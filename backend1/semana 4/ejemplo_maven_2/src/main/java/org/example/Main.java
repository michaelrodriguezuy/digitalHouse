package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClaseClasosa obj1 = new ClaseClasosa();
        obj1.attr1 = 150;
        obj1.attr2 = -100;

        ClaseClasosa obj2 = new ClaseClasosa();
        obj2.attr1 = 200;
        obj2.attr2 = -80;

        try (FileOutputStream fos = new FileOutputStream("fos_output.txt");
             FileWriter fw = new FileWriter("fw_output");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(obj1);
            oos.writeObject(obj2);

        }catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileInputStream fis = new FileInputStream("fos_output.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object objRecuperado1 = ois.readObject();
            Object objRecuperado2 = ois.readObject();

            System.out.println(objRecuperado1);
            System.out.println(objRecuperado2);


        }catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}