import { Component, OnInit } from '@angular/core';

import * as Prism from 'prismjs';
import { AgendaService } from './agenda.service';

@Component({
  templateUrl: './agenda.component.html',
  styleUrls: ['./agenda.component.css']
})
export class AgendaComponent implements OnInit {

  public agendList: any;

  constructor(public backEndService: AgendaService) {

  }

  ngOnInit() {
    setTimeout(() => {
      this.backEndService.listar().subscribe(dados => this.agendList = dados);
    }, 900);
  }

  onClickAgendar(agenda:any) {
    this.backEndService.agendar(agenda).subscribe(dados => console.log(dados));
  }


  onClickCancelarAgendamento(agenda:any) {
    this.backEndService.cancelarAgendamento(agenda).subscribe(dados => console.log(dados));
  }
}
