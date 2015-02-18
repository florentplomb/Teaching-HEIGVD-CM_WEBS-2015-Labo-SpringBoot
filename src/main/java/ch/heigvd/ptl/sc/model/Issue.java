package ch.heigvd.ptl.sc.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Issue {
	@Id
	private String id;
                  
        @DBRef
        private User author;
        @DBRef
        private IssueType issueType;
        @DBRef
        private GeoData geoData;
        @DBRef
        private Comment comment;
	
	private String desc;
        private String tag;
	private Date   date;
        private String status;
	

	protected List<String> roles;
	
	public String getFirstname() {
		return desc;
	}

	public void setFirstname(String firstname) {
		this.desc = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	public boolean hasRole(String role) {
		for (String userRole : roles) {
			if (userRole.equals(role)) {
				return true;
			}
		}
		return false;
	}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.ptl.sc.model;

/**
 *
 * @author Florent
 */
public class Issue {
    
}
