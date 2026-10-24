package com.rays.form;

import javax.validation.constraints.Min;

import javax.validation.constraints.NotBlank;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OnlineExaminationDto;

public class OnlineExaminationForm extends BaseForm {

	@NotBlank(message = "School name is required")
	private String schoolName;

	@NotBlank(message = "Subject is required")
	private String subject;

	@Min(value = 5, message = "Minimum 5 questions are required")
	private int totalQuestion;

	@Min(value = 1, message = "Total marks must be at least 1")
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
	public BaseDTO getDto() {

		OnlineExaminationDto dto = (OnlineExaminationDto) initDTO(new OnlineExaminationDto());

		dto.setId(id);
		dto.setSchoolName(schoolName);
		dto.setSubject(subject);
		dto.setTotalMarks(totalMarks);
		dto.setTotalQuestion(totalQuestion);

		return dto;
	}

}
