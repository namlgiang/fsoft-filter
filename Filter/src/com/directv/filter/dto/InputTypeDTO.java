package com.directv.filter.dto;

import java.io.Serializable;

public class InputTypeDTO implements Serializable {
    private long id;
    private String name;
    private String displayName;
    private MessageDTO messageDTO;

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

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

    public MessageDTO getMessageDTO() {
	return messageDTO;
    }

    public void setMessageDTO(MessageDTO messageDTO) {
	this.messageDTO = messageDTO;
    }

}