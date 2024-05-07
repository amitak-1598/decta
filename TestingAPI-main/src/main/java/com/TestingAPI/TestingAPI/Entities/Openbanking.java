package com.TestingAPI.TestingAPI.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "openbanking")
public class Openbanking {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID id;
	    
	    private String common_redirect;
	    private String openbanking_approve_url;
	    private String internal_id;
	    
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public String getCommon_redirect() {
			return common_redirect;
		}
		public void setCommon_redirect(String common_redirect) {
			this.common_redirect = common_redirect;
		}
		public String getOpenbanking_approve_url() {
			return openbanking_approve_url;
		}
		public void setOpenbanking_approve_url(String openbanking_approve_url) {
			this.openbanking_approve_url = openbanking_approve_url;
		}
		public String getInternal_id() {
			return internal_id;
		}
		public void setInternal_id(String internal_id) {
			this.internal_id = internal_id;
		}
	    
	    
	    
}
