package dao;

public abstract class AbstractDaoH2Latam<E> implements IDao<E>{
    protected String url = "jdbc:h2:~/db_clinica_20231;INIT=RUNSCRIPT FROM 'create.sql'";
    protected String username = "sa";
    protected String password = "";
}
