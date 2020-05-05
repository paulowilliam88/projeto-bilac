import {Component,  OnInit} from '@angular/core';

import * as Prism from 'prismjs';
import { AgendaService } from './agenda.service';

@Component({
  templateUrl: './agenda.component.html',
  styleUrls: ['./agenda.component.css']
})
export class AgendaComponent implements OnInit  {

  public agendList: any;

  constructor(public backEndService: AgendaService) {

  }

  ngOnInit() {
    this.backEndService.listar().subscribe(dados => this.agendList = dados);
  }

}
