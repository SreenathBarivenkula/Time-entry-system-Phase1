import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from '../api.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  implements OnInit{
  
user:User =new User();
  constructor(private apiservice:ApiService) {}

  ngOnInit():void{
  }
  userlogin(){
  console.log(this.user)
  this.apiservice.userlogin(this.user).subscribe(data=>{
    alert("login succssesfully")
  },error=>alert("Sorry enter correct data"));
  }
  
}

