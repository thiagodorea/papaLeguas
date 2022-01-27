import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RastreioService {

  private API_URL = environment.API_URL;
  constructor(private http: HttpClient) { }

  getEncomendaRastreio(codigo: string): Observable<any> {
    return this.http.get(this.API_URL + `/pedido/` + codigo);
  }
}



