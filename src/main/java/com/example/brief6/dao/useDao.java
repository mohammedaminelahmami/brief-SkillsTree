package com.example.brief6.dao;
import java.util.List;
import java.util.Map;

public interface useDao<T> {
    boolean save(T obj);
    boolean update(T obj);
    T findById(int id);
    boolean delete(int id);
    List<T> getAll();
    List<T> getAllWhere(String field, Object value);
    List<T> customQuery(String jpql, Map<String, Object> params);
    //    Object customNativeQuery(String sql, HashMap<String, Object> map);
}