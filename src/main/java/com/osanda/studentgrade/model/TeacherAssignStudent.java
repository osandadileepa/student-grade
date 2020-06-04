package com.osanda.studentgrade.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 
 * include records of every assignment that a Teacher assigns to a particular
 * student
 * 
 * @author Osanda Wedamulla
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "student_id", "teacher_id", "assignment_id" }) })
public class TeacherAssignStudent extends BaseModel {

	private static final long serialVersionUID = 417341374799350806L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.DETACH)
	private Student student;

	@OneToOne(cascade = CascadeType.DETACH)
	private Teacher teacher;

	@OneToOne(cascade = CascadeType.DETACH)
	private Assignment assignment;

}
