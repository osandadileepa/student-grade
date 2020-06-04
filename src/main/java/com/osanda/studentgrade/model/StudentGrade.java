package com.osanda.studentgrade.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.osanda.studentgrade.enums.Grade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 
 * all the students that are assigned with a assignment grade is presented based
 * on the teacher's observation
 * 
 * @author Osanda Wedamulla
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "grade", "student_id", "assignment_id" }) })
public class StudentGrade extends BaseModel {

	private static final long serialVersionUID = -1671459555746235174L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private Grade grade;

	@OneToOne(cascade = CascadeType.DETACH)
	private Student student;

	@OneToOne(cascade = CascadeType.DETACH)
	private Assignment assignment;

}
