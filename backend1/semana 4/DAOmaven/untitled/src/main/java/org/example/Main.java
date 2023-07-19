package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.example.model.*;
import org.example.service.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.debug("DEBUG");
        logger.info("INFO");
        logger.fatal("FATAL");
        logger.error("ERROR");
        logger.warn("WARN");


        Empleado emp1 = new Empleado(1, "Manuel", "Rockefeller", 43, "Masachusets");
        Empleado emp2 = new Empleado(2, "Gonzalo", "Fernandez", 38, "Cerro Largo");


        Empleado emp3 = new Empleado(3, "Laura", "Villanueva", 22, "Paris");

        EmpleadoService service1 = new EmpleadoService();
        EmpleadoService service2 = new EmpleadoService();
        EmpleadoService service3 = new EmpleadoService();

        service1.crearEmpleado(emp1);
        service2.crearEmpleado(emp2);


        service3.crearEmpleado(emp3);

        /*
        DaoEmpleado dEmp = new DaoEmpleado();
        dEmp.logger.info("info: ");
        dEmp.logger.error("error: ");
        dEmp.logger.warn("warn: ");
        */
    }
}