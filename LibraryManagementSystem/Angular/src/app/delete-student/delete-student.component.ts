import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-delete-student',
  templateUrl: './delete-student.component.html',
  styleUrls: ['./delete-student.component.css']
})
export class DeleteStudentComponent implements OnInit {
  studentData: any;

  constructor(private http: HttpClient, private router: Router, private service: AuthService) { }

  ngOnInit() {
  }

  getStudentInfo(Student: NgForm) {
    console.log(Student.value);
    this.http.get(`${this.service.baseURL}/library/librarian/getStudent/${Student.value.id}`, {headers: this.service.header})
      .subscribe(response => {
        console.log('response=',response);
        if (response != null) {
          alert('student data found');
        } else {
          alert('No Student Data Present for ID ' + Student.value.id);
        }
        this.studentData = response;
        
      });
  }

  deleteStudent(studentData) {
    this.http.delete(`${this.service.baseURL}/library/librarian/deleteStudent/${studentData.id}`,{headers: this.service.header})
      .subscribe(response => {
        if (response) {
           alert('Student Deleted Successfully');
           this.router.navigate(['/']);
           console.log(response);
        } else {
          alert('Failed to delete the Student');
          this.router.navigate(['/']);
        }
      });

  }

}
