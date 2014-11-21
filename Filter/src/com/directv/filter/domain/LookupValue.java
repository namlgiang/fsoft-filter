package com.directv.filter.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class LookupValue.
 */
@Entity(name = "LookupValue")
@Table(name = "LOOKUP_VALUE")
public class LookupValue implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7780697397929628661L;

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
//	@SequenceGenerator(name = "pk_lookupValue", sequenceName = "SEQ_LOOKUP_VALUE", allocationSize = 1)
//	@GeneratedValue(generator = "pk_lookupValue", strategy = GenerationType.SEQUENCE)
	@Column(name = "LOOKUP_VALUE_ID")
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
	
//	@Override
//	public boolean equals(Object object) {
//		if (object instanceof LookupValue) {
//			LookupValue that = (LookupValue) object;
//			return Objects.equal(this.id, that.id);
//		}
//		return false;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hashCode(id);
//	}
//	
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return Objects.toStringHelper(this).add("id", id).add("name", name)
//				.add("displayName", displayName).toString();
//	}
}

