package com.osanda.studentgrade.model.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.osanda.studentgrade.model.Result;
import com.osanda.studentgrade.model.projection.QuestionProjection.QuestionMinimunProjection;

public interface ResultProjection {

	@Projection(name = "basic", types = Result.class)
	public interface ResultBasicProjection {

		Double getTimeSpent();

		Integer getAttempts();

		@Value("#{target.answerStatus != null ? target.answerStatus.name:''}")
		String getAnswerStatus();

		QuestionMinimunProjection getQuestion();
	}

}
