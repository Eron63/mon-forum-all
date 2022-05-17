import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Messages } from '../models/message';

@Injectable({
  providedIn: 'root'
})
export class MessageService {

  constructor(private http: HttpClient) { }

  public findAll() {
    return this.http.get<Messages[]>(`${environment.API_URL}/messages`);
  }  
  public create(sujet: Messages) {
    return this.http.post<Messages>(`${environment.API_URL}/messages`, sujet); 
  }
  public findById(id: string) {
    return this.http.get<Messages>(`${environment.API_URL}/messages/${id}`);
  }
  public update(sujet:Messages) {
    return this.http.put<Messages>(`${environment.API_URL}/messages`, sujet);
  }
  public delete(id: string) {
    this.http.delete<Messages>(`${environment.API_URL}/messages/${id}`);
  }
}
