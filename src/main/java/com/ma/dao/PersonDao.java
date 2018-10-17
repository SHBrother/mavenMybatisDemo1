package com.ma.dao;

import java.util.List;

import com.ma.entity.PersonEntity;

public interface PersonDao {
	/**
	 * 插入一条记录
	 * @param person
	 */
	public void insert(PersonEntity person);
	
	/**
	 * 查询所有记录
	 * @return
	 */
	public List<PersonEntity> queryAll();


}
