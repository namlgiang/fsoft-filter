package com.directv.filter.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.directv.filter.domain.InputType;

public class InputTypeDAOImpl implements InputTypeDAO {
    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }

    @Override
    public List<InputType> findAllInputTypes() {
	Session session = sessionFactory.openSession();
	String hql = "FROM InputType";
	List<InputType> res = session.createQuery(hql).list();
	return res;
    }

}
