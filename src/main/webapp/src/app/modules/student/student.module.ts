import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StudentRoutingModule } from './student-routing.module';
import { StudentComponent } from './student.component';
import {FlexLayoutModule} from "@angular/flex-layout";
import {StudentService} from "./student.service";
import {MatDividerModule} from "@angular/material/divider";
import {MatListModule} from "@angular/material/list";


@NgModule({
  declarations: [StudentComponent],
  imports: [
    CommonModule,
    StudentRoutingModule,

    FlexLayoutModule,
    MatDividerModule,
    MatListModule
  ],
  providers: [StudentService]
})
export class StudentModule { }
