/*
 * Filter.java
 *
 * Copyright (c) 2011 DIRECTV, Inc.
 * An Unpublished Work.  All Rights Reserved.
 *
 * DIRECTV PROPRIETARY:  The information contained in or disclosed by this
 * document is considered proprietary by DIRECTV, Inc.  This document and/or the
 * information contained therein shall not be duplicated nor disclosed in whole
 * or in part without the specific written permission of DIRECTV, Inc.
 */
package com.directv.filter.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The Class Filter.
 */
@Entity(name = "Filter")
@Table(name = "LB_FILTER")
public class Filter implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1175581509276119760L;

	/** The id. */
	protected Long id;

	/** The name. */
	protected String name;

	/** The rank. */
	protected Long rank;

	/** The display name. */
	protected String displayName;

	/** publish folder flag */
	protected String filterType;	
	
	
	
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the display name.
	 * 
	 * @return the display name
	 */
	@Column(name = "DISPLAY_NAME")
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the display name.
	 * 
	 * @param displayName
	 *            the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the filterType
	 */
	@Column(name = "FILTER_TYPE")
	public String getFilterType() {
		return filterType;
	}

	/**
	 * @param filterType the filterType to set
	 */
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	
	

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "pk_lb_filter", sequenceName = "SEQ_LB_FILTER", allocationSize = 1)
	@GeneratedValue(generator = "pk_lb_filter", strategy = GenerationType.SEQUENCE)
	@Column(name = "FILTER_ID")
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "RANK")
	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	
}
