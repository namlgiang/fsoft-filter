package com.directv.filter.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

import com.directv.filter.domain.OperationType;
import com.directv.filter.dto.OperationTypeDTO;
import com.directv.filter.repository.OperationTypeDAO;

public class OperationTypeServiceImpl implements OperationTypeService {
    private OperationTypeDAO operationTypeDAO;
    private Mapper dozerMapper;

   

    public void setOperationTypeDAO(OperationTypeDAO operationTypeDAO) {
        this.operationTypeDAO = operationTypeDAO;
    }

    public void setDozerMapper(Mapper dozerMapper) {
	this.dozerMapper = dozerMapper;
    }

    @Override
    public List<OperationTypeDTO> getAllOperations() {
	List<OperationTypeDTO> res = null;
	List<OperationType> lOperationTypes = this.operationTypeDAO
		.findAllOperations();
	if (lOperationTypes != null) {
	    res = new ArrayList<OperationTypeDTO>();
	    for (OperationType operationType : lOperationTypes) {
		OperationTypeDTO operationTypeDTO = this.dozerMapper.map(
			operationType, OperationTypeDTO.class);
		res.add(operationTypeDTO);
	    }
	}
	return res;
    }
}
