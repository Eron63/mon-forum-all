import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Sujets } from '../models/sujet';

@Injectable({
  providedIn: 'root'
})
export class SujetService {

  constructor(private http: HttpClient) { }

  public findAll() {
    return this.http.get<Sujets[]>(`${environment.API_URL}/sujets`);
  }  
  public create(sujet: Sujets) {
    return this.http.post<Sujets>(`${environment.API_URL}/sujets`, sujet); 
  }
  public findById(id: string) {
    return this.http.get<Sujets>(`${environment.API_URL}/sujets/${id}`);
  }
  public update(sujet:Sujets) {
    return this.http.put<Sujets>(`${environment.API_URL}/sujets`, sujet);
  }
  public delete(id: string) {
    this.http.delete<Sujets>(`${environment.API_URL}/sujets/${id}`);
  }
}