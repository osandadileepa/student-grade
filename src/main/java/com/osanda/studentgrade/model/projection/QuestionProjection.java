package com.osanda.studentgrade.model.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.osanda.studentgrade.model.Question;

public interface QuestionProjection {

	@Projection(name = "minimum", types = { Question.class })
	public interface QuestionMinimunProjection {

		String getName();

		Double getMarks();

		String getDescription();

		String getAnswer();

		@Value("#{target.assignment != null ? target.assignment.name:''}")
		String getAssignment();

	}

}
