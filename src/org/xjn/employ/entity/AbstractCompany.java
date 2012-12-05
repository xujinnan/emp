package org.xjn.employ.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 公司
 * 包含企业的基本信息
 * @author XuJinnan
 *
 */
public abstract class AbstractCompany implements java.io.Serializable {

	private static final long serialVersionUID = -4095409320073254644L;
	// Fields
	private Integer companyId;
	private String name;
	private String kind;
	private String scale;
	private String bizType;
	private String tel;
	private String address;
	private String describ;
	/** 此公司的发布的所有职位 */
	private Set<Job> companyJobs = new HashSet<Job>(0);

	// Constructors

	/** default constructor */
	public AbstractCompany() {
	}

	/** full constructor */
	public AbstractCompany(String name, String kind, String scale,
			String bizType, String tel, String address, String describ,
			Set<Job> companyJobs) {
		this.name = name;
		this.kind = kind;
		this.scale = scale;
		this.bizType = bizType;
		this.tel = tel;
		this.address = address;
		this.describ = describ;
		this.companyJobs = companyJobs;
	}

	// Property accessors

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getScale() {
		return this.scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescrib() {
		return this.describ;
	}

	public void setDescrib(String describ) {
		this.describ = describ;
	}

	public Set<Job> getcompanyJobs() {
		return this.companyJobs;
	}

	public void setcompanyJobs(Set<Job> companyJobs) {
		this.companyJobs = companyJobs;
	}

}