package com.wuxi.domain;
import java.io.Serializable;

/**
* @author wuxi
 * 使用jpa中cache
* @date 2018年6月27日
 */
public class Cases implements Serializable{

	private static final long serialVersionUID = -1L;

	private int id;

    private String project;

    private String status;
    
    private String domain;
    
    private String requesttype;
    
    private String parametertype;
    
    private String content;
    
    private String result;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the requesttpye
	 */
	public String getRequesttype() {
		return requesttype;
	}

	/**
	 * @param requesttype the requesttype to set
	 */
	public void setRequesttype(String requesttype) {
		this.requesttype = requesttype;
	}

	/**
	 * @return the parametertype
	 */
	public String getParametertype() {
		return parametertype;
	}

	/**
	 * @param parametertype the parametertype to set
	 */
	public void setParametertype(String parametertype) {
		this.parametertype = parametertype;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the result
	 */
	public String getresult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setresult(String result) {
		this.result = result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Case [id=" + id + ", project=" + project + ", status=" + status + ", domain="
				+ domain + ", requesttype=" + requesttype + ", parametertype=" + parametertype + ", content=" + content
				+ ", result=" + result + "]";
	}

}
