import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AgendaService {

  private bankUrl = 'http://34.219.18.109:8080';

  constructor(private http: HttpClient) {
  }

  listar() {
    return this.http.get<any[]>(this.bankUrl);
  }

  agendar(agenda: any){
    let url = this.bankUrl+ "/" + agenda.id;
    agenda.tipoAgendamentoEnum = "AGENDADO";
    return this.http.put<any[]>(url,agenda);
  }

  cancelarAgendamento(agenda:any){
    let url = this.bankUrl+ "/" + agenda.id;
    agenda.tipoAgendamentoEnum = "AGENDAMENTO_CANCELADO";
    return this.http.put<any[]>(url, agenda);
  }
}
