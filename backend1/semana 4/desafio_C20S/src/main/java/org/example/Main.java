package org.example;

import org.example.model.Empleado;
import org.example.model.Empresa;

import java.io.*;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {


        Empresa empresa1 = new Empresa("Conaprole", 454545L);
        Empleado empleado1 = new Empleado("Pedro", "Ramirez", "Administrativo", 42000.00);
        Empleado empleado2 = new Empleado("Laura", "Ramirez", "Administrativo", 40000.00);
        Empleado empleado3 = new Empleado("Enrique", "Ramirez", "Administrativo", 38000.00);
        Empleado empleado4 = new Empleado("Josefina", "Ramirez", "Administrativo", 50000.00);

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);

        empresa1.setEmpledos(empleados);

        //paso el objeto a un archivo
        try (FileOutputStream fos = new FileOutputStream("empleadoDeEmpresa.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(empresa1);
        }catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //traigo el obejto desde un archivo
        try (FileInputStream fis = new FileInputStream("empleadoDeEmpresa.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object objRecuperado1 = ois.readObject();
            Empresa emp2 = (Empresa) objRecuperado1;

            System.out.println(emp2.getCUIT() );
            System.out.println(emp2.getRazonSocial());
            System.out.println(emp2.getEmpledos());


        }catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //guardo solamente los empleados pero no como objetos sino como datos separados por ;
        FileOutputStream fo = new FileOutputStream("empleados.txt");
            BufferedOutputStream bo = new BufferedOutputStream(fo);

            for (int i = 0; i < empresa1.getEmpledos().size(); i++) {

                try {
                    bo.write(((empresa1.getEmpledos().get(i).getNombre()+";"+
                                                                    empresa1.getEmpledos().get(i).getApellido()+";"+
                                                                    empresa1.getEmpledos().get(i).getPuesto()+";"+
                                                                    empresa1.getEmpledos().get(i).getSueldo())+"\r\n").getBytes());


                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            bo.close();
            fo.close();

        }

}