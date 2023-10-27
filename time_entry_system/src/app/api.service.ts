import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private BASE_URL = "http://localhost:8081/login";

  constructor(private http: HttpClient) {}

  userlogin(user: User):Observable<object> {
    console.log(user)
    return this.http.post(`${this.BASE_URL}`, user);
  }
}