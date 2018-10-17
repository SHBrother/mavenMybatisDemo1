package com.ma.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ma.dao.PersonDao;
import com.ma.entity.PersonEntity;
import com.ma.util.MyBatisUtil;

public class PersonDaoImpl implements PersonDao{
public static final String NAMESPACE = "com.ma.mapper.PersonEntityMapper";
	
	public void insert(PersonEntity person) {
		SqlSession session = MyBatisUtil.getSession();
		session.insert(NAMESPACE + ".insert" , person);
		
		session.commit();
		session.close();
	}
 
	public List<PersonEntity> queryAll() {
		SqlSession session = MyBatisUtil.getSession();
		List<PersonEntity> personList = session.selectList(NAMESPACE + ".queryAll");
		
		session.commit();
		session.close();
		
		return personList;
	}

	
}
