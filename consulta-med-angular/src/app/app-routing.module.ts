import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {
    path: '',
    data: {
      title: 'Inicio'
    },
    children: [
      {
        path: '',
        component: HomeComponent
      },
      {
        path: 'agenda',
        loadChildren: './agenda/agenda.module#AgendaModule',
        data: {
          title: 'Agenda'
        }
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
