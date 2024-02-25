import { AlertService } from './../../services/alert.service';
import { Component, OnInit } from '@angular/core';
import { IBook } from 'src/app/models/i-book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit {
  books: IBook[] = [];

  constructor(
    private bookService: BookService,
    private alertService: AlertService) {}

  ngOnInit(): void {
    this.bookService.findAll().subscribe({
      next:(data) => {
        this.books = data;
      },
      error: (err) => {
        const tit = 'Erro buscando livros';
        const msg = err.message;
        this.alertService.error(tit,msg);
        //console.error(err);
      }
    });

    /*/this.service.findAll().subscribe({
      next: (data) => this.books = data,
      error: (err) => console.error(err)  // Remova o ponto e vírgula extra aqui
    });

    this.books = [
      {id:3, title:'Quem pensa, enriquece', category:'Finança'},
      {id:4, title:'Em busca de nós mesmos', category:'Filosofia'},
      {id:5, title:'A História da Fada Azulina', category:'Conto Infantil'},
    ];

    // apenas para debug
    for (let b of this.books) {
      console.log( b.id );
      console.log( b.title );
      console.log( b.category );
    }/*/
  }
}
