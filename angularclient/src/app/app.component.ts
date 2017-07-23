import { Component } from '@angular/core';
import {UserService} from "./service/user/user.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
  token;

  constructor(private userService:UserService){

  }

  ngOnInit() {
    console.log('ngOnInit')

    this.token = this.userService.login("user","password");
  }
}
