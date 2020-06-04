package com.osanda.studentgrade.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 
 * includes all the details regards to a questions
 * 
 * @author Osanda Wedamulla
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Question extends BaseModel {

	private static final long serialVersionUID = -201374461005931855L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	private Double marks;

	@Column(length = 1000)
	private String description;

	@Column(length = 5000)
	private String answer;

	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private Assignment assignment;

}
