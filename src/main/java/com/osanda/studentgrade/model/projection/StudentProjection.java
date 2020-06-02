package com.osanda.studentgrade.model.projection;

import org.springframework.data.rest.core.config.Projection;

import com.osanda.studentgrade.model.Student;
import com.osanda.studentgrade.model.projection.ResultProjection.ResultBasicProjection;

public interface StudentProjection {

	@Projection(name = "student", types = {Student.class})
	public interface StudentBasicProjection {

		ResultBasicProjection getResults();

	}

}
