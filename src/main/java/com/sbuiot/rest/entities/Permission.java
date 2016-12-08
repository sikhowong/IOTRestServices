package com.sbuiot.rest.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission implements Serializable {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
	
	@Column(name="user")
	private String user;
	
	@Column(name="object")
	private String object;
	
	@Column(name="time_range_start")
	private String time_range_start;
	
	@Column(name="time_range_end")
	private String time_range_end;

	@Column(name="control")
	private String control;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getTime_range_start() {
		return time_range_start;
	}

	public void setTime_range_start(String time_range_start) {
		this.time_range_start = time_range_start;
	}

	public String getTime_range_end() {
		return time_range_end;
	}

	public void setTime_range_end(String time_range_end) {
		this.time_range_end = time_range_end;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((control == null) ? 0 : control.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result + ((time_range_end == null) ? 0 : time_range_end.hashCode());
		result = prime * result + ((time_range_start == null) ? 0 : time_range_start.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Permission other = (Permission) obj;
		if (control == null) {
			if (other.control != null)
				return false;
		} else if (!control.equals(other.control))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (time_range_end == null) {
			if (other.time_range_end != null)
				return false;
		} else if (!time_range_end.equals(other.time_range_end))
			return false;
		if (time_range_start == null) {
			if (other.time_range_start != null)
				return false;
		} else if (!time_range_start.equals(other.time_range_start))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	
}
