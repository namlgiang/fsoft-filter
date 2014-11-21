package com.directv.filter.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.directv.filter.domain.Filter;

@Repository
public class FilterDAOImpl implements FilterDAO{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addFilter(Filter filter) {
	Session session = this.sessionFactory.openSession();
	session.save(filter);
    }
    
}
