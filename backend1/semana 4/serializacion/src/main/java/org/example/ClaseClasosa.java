package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;

public class ClaseClasosa implements Serializable {

    public Logger logger = LogManager.getLogger(ClaseClasosa.class);
    public int attr1 = 10;
    public transient int attr2 = -1; //indice que no se serializa

    public void hacerAlgo(){
        System.out.println("Hola desde la Clase");
    }

    @Override
    public String toString() {
        return "ClaseClasosa{" +
                "attr1=" + attr1 +
                ", attr2=" + attr2 +
                '}';
    }
}
