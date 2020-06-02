package com.osanda.studentgrade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 
 * model includes the basic information relevant to a student
 * 
 * @author Osanda Wedamulla
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Result extends BaseModel {

	private static final long serialVersionUID = -8649647333265784338L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private AnswerStatus answerStatus;

	@OneToOne
	private Question question;

	private Double timeSpent;

	private Integer attempts;

}
