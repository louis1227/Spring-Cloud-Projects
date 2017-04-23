import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import {UserToken} from "./user-token";
import { Observable }     from 'rxjs/Observable';

@Injectable()
export class UserService {

  private static client_id= 'acme';
  private static clent_secret = "acmesecret";

  constructor(private http: Http) { }

  login(username: string, password: string){
    const url = 'acme:acmesecret@localhost:9999/uaa/oauth/token?grant_type=password&username=user&password=password';
    console.log(url);
    return this.http.post(url, null, {headers: null})
      .subscribe(res=>res.json())
  }
}
