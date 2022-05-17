import { Messages } from 'src/app/models/message';
import { Component, OnInit } from '@angular/core';
import { MessageService } from 'src/app/services/message.service';
import { ActivatedRoute } from '@angular/router';
import { Sujets } from 'src/app/models/sujet';
import { SujetService } from 'src/app/services/sujet.service';

@Component({
  selector: 'app-sujet',
  templateUrl: './sujet.component.html',
  styleUrls: ['./sujet.component.scss']
})
export class SujetComponent implements OnInit {

  sujet?: any;
  idSujet: string;

  constructor(private service: SujetService, private route: ActivatedRoute) { 
    this.idSujet = this.route.snapshot.params['id'];   
    this.service.findById(this.idSujet).subscribe(data => {
      this.sujet = data; });
      console.log(this.sujet); 
  }

  ngOnInit(): void {
    console.log(this.sujet); 
   }

}
