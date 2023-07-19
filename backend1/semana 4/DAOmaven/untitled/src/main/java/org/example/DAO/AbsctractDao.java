package org.example.DAO;

public abstract class AbsctractDao<E> implements IDao<E>{

    protected String url, username, password;

    public AbsctractDao(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }


}
