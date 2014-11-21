package com.directv.filter.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

import com.directv.filter.domain.InputType;
import com.directv.filter.dto.InputTypeDTO;
import com.directv.filter.repository.InputTypeDAO;

public class InputTypeServiceImpl implements InputTypeService{
    
    private InputTypeDAO inputTypeDAO;
    
    private Mapper dozerMapper;
    
    public void setInputTypeDAO(InputTypeDAO inputTypeDAO) {
        this.inputTypeDAO = inputTypeDAO;
    }
    
    
    


    public void setDozerMapper(Mapper dozerMapper) {
        this.dozerMapper = dozerMapper;
    }





    @Override
    public List<InputTypeDTO> getAllInputTypeDTOs() {
	List<InputType> lInputTypes = this.inputTypeDAO.findAllInputTypes();
	
	List<InputTypeDTO> res = null;
	if(lInputTypes!=null) {
	    res = new ArrayList<InputTypeDTO>();
	    for(InputType inputType:lInputTypes) {
		InputTypeDTO inputTypeDTO = this.dozerMapper.map(inputType, InputTypeDTO.class);
		res.add(inputTypeDTO);
	    }
	}
	return res;
    }

}
