import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  private bankUrl = 'https://brasil.io/api/dataset/covid19/caso/data/?page=2';

  constructor(private http: HttpClient) {
  }

  listar() {
    return this.http.get<any[]>(this.bankUrl);
  }
}
