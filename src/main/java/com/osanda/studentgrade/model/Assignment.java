package com.osanda.studentgrade.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 
 * model includes the basic information of a assignment
 * 
 * @author Osanda Wedamulla
 *
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Assignment extends BaseModel {

	private static final long serialVersionUID = 6249544351433711871L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "assignment", fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	private Set<Question> questions;

}
