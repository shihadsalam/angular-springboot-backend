package com.boot.angular.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

@Document(collection = "profile_fields")
public class ProfileFields {
    
	@Id
    private String id;
	private String type;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
    
    public ProfileFields() {
    	
    }

	public ProfileFields(String id, String type, String field1, String field2, String field3, String field4, String field5,
			String field6, String field7, String field8, String field9, String field10) {
		super();
		this.id = id;
		this.type = type;
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
		this.field6 = field6;
		this.field7 = field8;
		this.field8 = field8;
		this.field9 = field9;
		this.field10 = field10;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	public String getField7() {
		return field7;
	}

	public void setField7(String field7) {
		this.field7 = field7;
	}

	public String getField8() {
		return field8;
	}

	public void setField8(String field8) {
		this.field8 = field8;
	}
	
	public String getField9() {
		return field9;
	}

	public void setField9(String field9) {
		this.field9 = field9;
	}

	public String getField10() {
		return field10;
	}

	public void setField10(String field10) {
		this.field10 = field10;
	}

	public List<String> getFieldsList() {
		return Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10);
	}
	
	public List<String> getNonEmptyFieldsList() {
		return getFieldsList().stream().filter(field -> !StringUtils.isEmpty(field)).collect(Collectors.toList());
	}
    
}
