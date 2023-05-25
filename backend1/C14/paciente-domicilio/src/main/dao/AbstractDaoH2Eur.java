package main.dao;

public abstract class AbstractDaoH2Eur<E> implements IDao<E>{
    protected String url = "jdbc:h2:~/db_clinica_20231;INIT=RUNSCRIPT FROM 'create.sql'";
    protected String username = "sa-eur";
    protected String password = "12345";
}
