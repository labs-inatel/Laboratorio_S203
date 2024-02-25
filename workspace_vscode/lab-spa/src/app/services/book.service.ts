import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IBook } from '../models/i-book';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {
  //private readonly URI_BOOKS = 'assets/exemplo-de-livros-json.json'; // Include the file extension
  private readonly URI_BOOKS = 'http:localhost:8080/book';

  constructor(private http: HttpClient ) { }

  public findAll(): Observable<IBook[]>{
    return this.http.get<IBook[]>(this.URI_BOOKS);
  }
}
