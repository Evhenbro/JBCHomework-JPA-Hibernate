package DAO;

import java.io.Serializable;
import java.util.List;

public interface DAOImpl<T, ID extends Serializable> {

    T save(T entity);
    void delete(ID id);
    T findById(ID id);
    List<T> findAll();

}
