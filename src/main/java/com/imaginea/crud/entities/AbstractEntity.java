package com.imaginea.crud.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.Date;

/**
 * @author umamaheswaraa
 *
 */
@MappedSuperclass
public class AbstractEntity implements Serializable,Entity {

	private static final long serialVersionUID = 2590118664453850441L;
	private Long id;
	private Boolean isDeleted = false;
	private String createdBy;
	private Date createdOn;
	private String changedBy;
	private Date changedOn;
	
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="isdeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Column(name="created_by")
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	@Column(name="created_on")
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	@Column(name="changed_by")
	public String getChangedBy() {
		return changedBy;
	}
	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}
	@Column(name="changed_on")
	public Date getChangedOn() {
		return changedOn;
	}
	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	} 
	
}
