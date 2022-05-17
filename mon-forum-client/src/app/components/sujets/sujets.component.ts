import { Component, OnInit } from '@angular/core';
import { Sujets } from 'src/app/models/sujet';
import { SujetService } from 'src/app/services/sujet.service';

@Component({
  selector: 'app-sujets',
  templateUrl: './sujets.component.html',
  styleUrls: ['./sujets.component.scss']
})
export class SujetsComponent implements OnInit {

  sujets: Sujets[] = [];
  newSujetName:string = "";
  newSujet : Sujets;

  constructor(private service: SujetService) { 
    this.newSujet = new Sujets;
  }

  ngOnInit(): void {
    this.service.findAll().subscribe( data => {
      this.sujets = data; })
  }

  ajouterSujet(){
    this.newSujet.tilteSujet = this.newSujetName;
    this.service.create(this.newSujet);
  }

}
