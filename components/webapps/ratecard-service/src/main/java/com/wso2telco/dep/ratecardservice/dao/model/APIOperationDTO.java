package com.wso2telco.dep.ratecardservice.dao.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class APIOperationDTO {

	private Integer apiOperationId;
	private APIDTO api;
	private String apiOperation;
	private String apiOperationCode;
	private String createdBy;
	private String createdDate;
	private String updatedBy;
	private String updatedDate;
	
	public Integer getApiOperationId() {
		return apiOperationId;
	}
	public void setApiOperationId(Integer apiOperationId) {
		this.apiOperationId = apiOperationId;
	}
	public APIDTO getApi() {
		return api;
	}
	public void setApi(APIDTO api) {
		this.api = api;
	}
	public String getApiOperation() {
		return apiOperation;
	}
	public void setApiOperation(String apiOperation) {
		this.apiOperation = apiOperation;
	}
	public String getApiOperationCode() {
		return apiOperationCode;
	}
	public void setApiOperationCode(String apiOperationCode) {
		this.apiOperationCode = apiOperationCode;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
}
