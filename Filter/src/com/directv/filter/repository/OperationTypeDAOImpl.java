package com.directv.filter.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.directv.filter.domain.OperationType;

public class OperationTypeDAOImpl implements OperationTypeDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }

    @Override
    public List<OperationType> findAllOperations() {
	String hql = "FROM OperationType";
	Session session = this.sessionFactory.openSession();
	return session.createQuery(hql).list();
    }

}
