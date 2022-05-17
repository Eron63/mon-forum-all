import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-sujets-card',
  templateUrl: './sujets-card.component.html',
  styleUrls: ['./sujets-card.component.scss']
})
export class SujetsCardComponent implements OnInit {

  @Input() sujet:any;

  constructor() { }

  ngOnInit(): void {
  }

}
