package com.osanda.studentgrade.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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
public class Student extends BaseModel {

	private static final long serialVersionUID = -8704715808803308393L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	private Integer age;

	private String grade;

	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinTable(joinColumns = {
			@JoinColumn(name = "student_id", referencedColumnName = "id", nullable = true) }, inverseJoinColumns = {
					@JoinColumn(name = "assignment_id", referencedColumnName = "id", nullable = true) })
	private Set<Assignment> assignments = new HashSet<>();

	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private SchoolClass schoolClass;

	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	@JoinTable(joinColumns = {
			@JoinColumn(name = "student_id", referencedColumnName = "id", nullable = true) }, inverseJoinColumns = {
					@JoinColumn(name = "result_id", referencedColumnName = "id", nullable = true) })
	private List<Result> results = new ArrayList<	>();

}
