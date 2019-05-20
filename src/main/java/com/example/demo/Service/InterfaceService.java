package com.example.demo.Service;


import java.util.List;

public interface InterfaceService<T> {

   public List<T> fetchAll();
   public T tilføj(T t);
   public T find(T t);
   public T slet(T t);
   public T rediger(T t);

}
