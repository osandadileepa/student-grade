import { Component, OnInit } from '@angular/core';
import {RESULT_ENDPOINT, StudentService} from "./student.service";
import {Student} from "../models/student";
import {Result} from "../models/result";

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {

  private studentId : number = 1;

  public student: Student;
  public results: Result[] = [];

  constructor(private service: StudentService) { }

  ngOnInit() {
    this.getResultByStudentId();
    this.getStudentDetails();
  }

  /***
   * get result for a particulat student
   *
   * @author Osanda Wedamulla
   */
  private getResultByStudentId() {

    this.service.getResultsFromStudentId(this.studentId).subscribe((result: any) => {
      const resultValue = result._embedded[RESULT_ENDPOINT];
      this.results = resultValue;
    });

  }// getResultByStudentId()

  /***
   *
   * get avialable student details
   *
   * @author Osanda Wedamulla
   */
  private getStudentDetails() {

    this.service.getStudentDetailsFromId(this.studentId).subscribe((value: any) =>{
      this.student = value;
    });

  }//getStudentDetails()

}// StudentComponent {}
