package com.imaginea.crud.entities;

import java.util.Date;

public interface IEntity {

	public Long getId();
	public void setId(Long id);
	public Boolean getIsDeleted();
	public void setIsDeleted(Boolean isDeleted);
	public String getCreatedBy();
	public void setCreatedBy(String createdBy);
	public Date getCreatedOn();
	public void setCreatedOn(Date createdOn);
	public String getChangedBy();
	public void setChangedBy(String changedBy);
	public Date getChangedOn();
	public void setChangedOn(Date changedOn);
	
}
