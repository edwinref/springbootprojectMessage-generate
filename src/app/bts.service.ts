

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Bts } from './bts';
import { environment } from 'src/environments/environment';
type NewType = Observable<Bts[]>;

@Injectable({providedIn: 'root'})
export class BtsService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getBts(): NewType {
    return this.http.get<Bts[]>(`${this.apiServerUrl}/bts/all`);
  }

  public addBts(bts: Bts): Observable<Bts> {
    return this.http.post<Bts>(`${this.apiServerUrl}/bts/add`, bts);
  }

  public updateBts(bts: Bts): Observable<Bts> {
    return this.http.put<Bts>(`${this.apiServerUrl}/bts/update`, bts);
  }

  public deleteBts(msg_seq: string): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/bts/delete/${msg_seq}`);
  }
}


