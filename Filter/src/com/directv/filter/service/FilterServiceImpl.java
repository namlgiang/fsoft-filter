package com.directv.filter.service;

import org.dozer.Mapper;

import com.directv.filter.domain.Filter;
import com.directv.filter.dto.FilterDTO;
import com.directv.filter.repository.FilterDAO;

public class FilterServiceImpl implements FilterService{
    private FilterDAO filterDAO;
    private Mapper dozerMapper;
    

    public void setFilterDAO(FilterDAO filterDAO) {
        this.filterDAO = filterDAO;
    }

    
    public void setDozerMapper(Mapper dozerMapper) {
        this.dozerMapper = dozerMapper;
    }


    @Override
    public void addFilter(FilterDTO filterDTO) {
	Filter filter = this.dozerMapper.map(filterDTO, Filter.class);
	this.filterDAO.addFilter(filter);
    }
    
}
