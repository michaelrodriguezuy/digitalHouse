package dao;

public interface IDao<E> {
    E findById(String id);

    E create(E e);
}
