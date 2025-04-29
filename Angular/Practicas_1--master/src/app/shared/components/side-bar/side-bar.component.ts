import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SideBarComponent } from './side-bar.component';  // Asegúrate de tener esta importación

@NgModule({
  declarations: [SideBarComponent],   // ¡Aquí debe estar declarado!
  imports: [CommonModule],
  exports: [SideBarComponent]         // ¡Y también exportado!
})
export class SideBarModule {}
export { SideBarComponent };

