/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 1895101
 * @param <T>
 * @param <Id>
 */
public interface IDAO <T, Id extends Serializable>{
	public void persist(T entity);	
	public void update(T entity);	
	public T findById(Id id);	
	public void delete(T entity);
	public List<T> findAll();
	public void deleteAll();
	
}