import { Component, AfterViewInit, OnInit } from '@angular/core';

import * as Prism from 'prismjs';
import { HomeService } from './home.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements AfterViewInit, OnInit {

  public dadoArray: any;

  constructor(public homeService: HomeService) {

  }

  ngOnInit() {
    setTimeout(() => {
      this.homeService.listar().subscribe((dados:any) => this.dadoArray = dados.results);
    }, 900);
  }

  ngAfterViewInit() {
    Prism.highlightAll();
  }

}
