import { Component, OnInit } from '@angular/core';
import { Persion } from '../models/persion.model';
import { Router } from '@angular/router';
import { LoginService } from '../service/login.service';
import { Login001 } from '../models/Login001.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  elements = ["name", "password"];

  persion: Persion = {"name": "", "password": ""};

  opeName : string = "";

  validName : boolean = false;
  validPassword : boolean = false;
  isSubmit : boolean = false;

  constructor(private router : Router, private loginService : LoginService) { }

  ngOnInit() {
  }

  showLabel(element : string) : string {
    return element.charAt(0).toUpperCase() + element.slice(1);
  }

  showIconOk(element: string) : boolean {
    if (element === "name") {
      return this.validName && !this.isEmtity(this.persion.name);
    }
    return this.validPassword && !this.isEmtity(this.persion.password);
  }

  showIconError(element : string) : boolean {
    if (element === "name") {
      return !this.validName && !this.isEmtity(this.persion.name);
    }
    return !this.validPassword && !this.isEmtity(this.persion.password);
  }

  disButton() : boolean {
    return !(this.validName && this.validPassword);
  }

  isEmtity(value: string) : boolean {
    return value.length > 0 ? false : true;
  }

  onkeyup(value : string, element : string) {
    if (element === "name") {
      this.persion.name = value;
    } else if (element === "password") {
      this.persion.password = value;
    }
  }

  onblur(element : string) {
    if (element === "name") {
      this.validName = false;
      this.loginService.operatorLogin(this.persion).subscribe(
        (val : Login001) => {
          console.log("POST call successful value returned in body", 
                      val);
          this.opeName = val.outOpeName;   
          let retCode = val.outRetCode;
          if (retCode === 0) {
            this.validName = true;
          }
        },
        response => {
            console.log("POST call in error", response);
            this.opeName = '';
        },
        () => {
            console.log("The POST observable is now completed.");
        }
      );
    } else if (element === "password") {
      this.validPassword = false;
      this.loginService.passwordLogin(this.persion).subscribe(
        (val : Login001) => {
          console.log("POST call successful value returned in body", 
                      val);
          let name = val.outOpeName;   
          let retcode = val.outRetCode;  
          if (retcode === 0) {
            this.validPassword = true;
          } 
        },
        response => {
            console.log("POST call in error", response);
        },
        () => {
            console.log("The POST observable is now completed.");
        }
      );
    }
  }

  submit() {
    this.isSubmit = true;
    
    this.loginService.postLogin(this.persion).subscribe(
      (val : Login001) => {
        console.log("POST call successful value returned in body", 
                    val);
        let retcode = val.outRetCode;  
        if (retcode === 0) {
          this.router.navigate(["home"]);     
        }
      },
      response => {
          console.log("POST call in error", response);
      },
      () => {
          console.log("The POST observable is now completed.");
      }
    );
  }
}
