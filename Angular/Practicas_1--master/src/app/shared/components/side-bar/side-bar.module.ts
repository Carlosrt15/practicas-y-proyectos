// side-bar.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SideBarComponent } from './side-bar.component';  // Asegúrate de que esta importación sea correcta

@NgModule({
  declarations: [SideBarComponent],  // El componente debe estar declarado aquí
  imports: [CommonModule],
  exports: [SideBarComponent]         // Y también exportado para su uso en otros módulos
})
export class SideBarModule {}
