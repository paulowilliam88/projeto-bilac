import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AgendaRoutingModule } from './agenda-routing.module';
import { AgendaComponent } from './agenda.component';

import { AccordionModule as MkAccordionModule, BoxModule } from 'angular-admin-lte';


@NgModule({
  imports: [
    CommonModule,
    AgendaRoutingModule,
    MkAccordionModule,
    BoxModule
  ],
  declarations: [AgendaComponent]
})
export class AgendaModule { }
