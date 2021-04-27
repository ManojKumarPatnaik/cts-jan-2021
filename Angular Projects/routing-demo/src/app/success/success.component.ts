import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { UsersService } from '../users.service';
@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {
  user : any | undefined = undefined;
  constructor(
    private activatedRoute : ActivatedRoute,
    private service : UsersService
    ) { }

  ngOnInit(): void {
   this.activatedRoute.params.subscribe((p : Params) => {
     let id = p.userId;
     this.service.fetch(id).subscribe(success => this.user = success);
   }); 
  }

}
