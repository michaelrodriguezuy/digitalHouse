package org.example.service;

import org.example.DAO.IDao;
import org.example.DAO.impl.DaoEmpleado;
import org.example.model.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {

    IDao<Empleado> empleadoDao = new DaoEmpleado("jdbc:h2:C:\\H2\\bin;INIT=RUNSCRIPT FROM 'classpath:create.sql'", "sa", "");


    public List<Empleado> consultarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        empleados = empleadoDao.findAll();
        return empleados;
    }

    public boolean crearEmpleado(Empleado emp) {

        if(empleadoDao.create(emp) != null){
            return true;
        }

        return false;

    }


}
