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
 * The Class InputType.
 */
@Entity(name = "InputType")
@Table(name = "INPUT_TYPE")
public class InputType implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5240488830386987715L;
	
	/** The id. */
	protected Long id;

	/** The name. */
	protected String name;

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
	 * @param name the new name
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
	 * @param displayName the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/** The display name. */
	protected String displayName;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "pk_inputType", sequenceName = "SEQ_INPUT_TYPE", allocationSize = 1)
	@GeneratedValue(generator = "pk_inputType", strategy = GenerationType.SEQUENCE)
	@Column(name = "INPUT_TYPE_ID")
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
