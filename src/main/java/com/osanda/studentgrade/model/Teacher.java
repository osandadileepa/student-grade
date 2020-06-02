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
 * model includes the basic details of a teacher
 * 
 * @author Osanda Wedamulla
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Teacher extends BaseModel {

	private static final long serialVersionUID = -5536158763879610630L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

}
