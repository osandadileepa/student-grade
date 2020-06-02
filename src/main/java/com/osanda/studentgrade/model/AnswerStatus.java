package com.osanda.studentgrade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 
 * answer types that can be added dynamicaly if needed
 * 
 * @author Osanda Wedamulla
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AnswerStatus extends BaseModel {

	private static final long serialVersionUID = -2211219940413020505L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

}
