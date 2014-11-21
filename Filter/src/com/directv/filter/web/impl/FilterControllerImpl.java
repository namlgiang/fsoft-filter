package com.directv.filter.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.directv.filter.dto.FilterDTO;
import com.directv.filter.dto.InputTypeDTO;
import com.directv.filter.dto.OperationTypeDTO;
import com.directv.filter.service.InputTypeService;
import com.directv.filter.service.OperationTypeService;
import com.directv.filter.web.FilterController;

@Component
@Controller
public class FilterControllerImpl implements FilterController{
    @Autowired
    private InputTypeService inputTypeService;
    @Autowired
    private OperationTypeService operationTypeService;
    
    @Override
    public ModelAndView addFilter(@ModelAttribute("filterDTO") FilterDTO filterDTO) {
	return null;
    }
    
    @Override
    public String show(Model model) {
	
	List<InputTypeDTO>lInputTypeDtos = this.inputTypeService.getAllInputTypeDTOs();
	List<OperationTypeDTO>lOperationTypeDTOs = this.operationTypeService.getAllOperations();
	
	model.addAttribute("lInputTypeDtos", lInputTypeDtos);
	model.addAttribute("lOperationTypeDTOs", lOperationTypeDTOs);
	return "new";
    }

}
