import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SujetComponent } from './components/sujets/sujet/sujet.component';
import { SujetsComponent } from './components/sujets/sujets.component';

const routes: Routes = [
  {path: 'sujets', component:SujetsComponent},
  {path: 'sujets/:id', component:SujetComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
