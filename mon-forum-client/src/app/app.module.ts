import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SujetsComponent } from './components/sujets/sujets.component';
import { SujetsCardComponent } from './components/sujets/sujets-card/sujets-card.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SujetComponent } from './components/sujets/sujet/sujet.component';
import { MessageCardComponent } from './components/sujets/message-card/message-card.component';

@NgModule({
  declarations: [
    AppComponent,
    SujetsComponent,
    SujetsCardComponent,
    NavbarComponent,
    SujetComponent,
    MessageCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
