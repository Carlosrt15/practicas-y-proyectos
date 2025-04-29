// home.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home.component';
import { HomeRoutingModule } from './home-routing.module';
import { SharedModule } from '@shared/shared.module';  // Solo importa SharedModule

@NgModule({
  declarations: [HomeComponent],
  imports: [
    CommonModule,
    HomeRoutingModule,
    SharedModule  // Ya importa el SideBarModule a través de SharedModule
  ]
})
export class HomeModule { }
