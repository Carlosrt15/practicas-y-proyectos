// shared.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SideBarModule } from './components/side-bar/side-bar.module';  // Asegúrate de que esta ruta sea correcta
import { MediaPlayerModule } from './components/media-player/media-player.module';
import { HeaderUserModule } from './components/header-user/header-user.module';

@NgModule({
  imports: [
    CommonModule,
    SideBarModule,  // Ya lo importaste aquí
    MediaPlayerModule,
    HeaderUserModule
  ],
  exports: [
    SideBarModule,  // Exportas el SideBarModule para que esté disponible en otros módulos
    MediaPlayerModule,
    HeaderUserModule
  ]
})
export class SharedModule {}
