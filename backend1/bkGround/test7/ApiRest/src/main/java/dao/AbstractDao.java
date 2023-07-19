package dao;

public abstract class AbstractDao<E> implements IDao<E> {
    protected String url;
    protected String username;
    protected String password;

    public AbstractDao(String url, String username, String password){
        this.url = url;
        this.password = password;
        this.username = username;
    }
}
