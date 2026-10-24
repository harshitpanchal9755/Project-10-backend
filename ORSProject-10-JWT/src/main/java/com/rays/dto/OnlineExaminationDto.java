package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "onlineexamination")
public class OnlineExaminationDto extends BaseDTO {

	private String schoolName;
	private String subject;
	private int totalQuestion;
	private int totalMarks;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTotalQuestion() {
		return totalQuestion;
	}

	public void setTotalQuestion(int totalQuestion) {
		this.totalQuestion = totalQuestion;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "schoolName";
	}

	@Override
	public String getUniqueValue() {
		return "schoolName";
	}

	@Override
	public String getLabel() {
		return "onlineexamination";
	}

	@Override
	public String getTableName() {
		return "onlineexamination";
	}

}
