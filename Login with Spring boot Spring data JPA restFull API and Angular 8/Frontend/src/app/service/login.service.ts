import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persion } from '../models/persion.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private ROOT_URL1 = "http://localhost:8080/operatorexit";

  private ROOT_URL2 = "http://localhost:8080/passwordexit";

  private ROOT_URL3 = "http://localhost:8080/login";

  constructor(private http : HttpClient) { }

  operatorLogin(persion: Persion) {
    return this.http.post(this.ROOT_URL1, persion);
  }

  passwordLogin(persion: Persion) {
    return this.http.post(this.ROOT_URL2, persion);
  }

  postLogin(persion: Persion) {
    return this.http.post(this.ROOT_URL3, persion);
  }

}
