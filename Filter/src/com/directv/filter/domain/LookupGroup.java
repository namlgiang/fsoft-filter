package com.directv.filter.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/**
 * The Class LookupGroup.
 */
@Entity(name = "LookupGroup")
@Table(name = "LOOKUP_GROUP")
public class LookupGroup implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -570711193084513833L;

	/** The id. */
	protected Long id;

	/** The name. */
	protected String name;

	/** The lookup group values. */
	protected Set<LookupValue> lookupGroupValue;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "pk_lookupGroup", sequenceName = "SEQ_LOOKUP_GROUP", allocationSize = 1)
	@GeneratedValue(generator = "pk_lookupGroup", strategy = GenerationType.SEQUENCE)
	@Column(name = "LOOKUP_GROUP_ID")
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

	/**
	 * Gets the lookup group value.
	 *
	 * @return the lookup group value
	 */
	@OneToMany(targetEntity = LookupValue.class, mappedBy = "pk.lookupGroup", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public Set<LookupValue> getLookupGroupValue() {
		return lookupGroupValue;
	}

	/**
	 * Sets the lookup group value.
	 *
	 * @param lookupGroupValue the new lookup group value
	 */
	public void setLookupGroupValue(Set<LookupValue> lookupGroupValue) {
		this.lookupGroupValue = lookupGroupValue;
	}

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
//
//	@Override
//	public boolean equals(Object object) {
//		if (object instanceof LookupGroup) {
//			LookupGroup that = (LookupGroup) object;
//			return Objects.equal(this.id, that.id);
//		}
//		return false;
//	}

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
//				.toString();
//	}
}

