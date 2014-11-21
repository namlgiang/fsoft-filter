package com.directv.filter.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.directv.filter.dto.FilterDTO;

@RequestMapping("/filterAction")
public interface FilterController {
    @RequestMapping(method=RequestMethod.POST,value="/add")
    public ModelAndView addFilter(FilterDTO filterDTO);
    
    @RequestMapping(method=RequestMethod.GET,value="/show")
    public String show(Model model);
}
