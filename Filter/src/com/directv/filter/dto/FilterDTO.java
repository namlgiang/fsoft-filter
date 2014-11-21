package com.directv.filter.dto;

import java.io.Serializable;

public class FilterDTO implements Serializable{
    private String name;
    private String displayName;
    private String filterType;
    private MessageDTO messageDTO;
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDisplayName() {
	return displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    public String getFilterType() {
	return filterType;
    }

    public void setFilterType(String filterType) {
	this.filterType = filterType;
    }

    public MessageDTO getMessageDTO() {
        return messageDTO;
    }

    public void setMessageDTO(MessageDTO messageDTO) {
        this.messageDTO = messageDTO;
    }
    
}
