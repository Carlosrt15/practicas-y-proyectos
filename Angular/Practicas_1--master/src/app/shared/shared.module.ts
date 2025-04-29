import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SideBarModule } from './components/side-bar/side-bar.module';
import { MediaPlayerModule } from './components/media-player/media-player.module';
import { HeaderUserModule } from './components/header-user/header-user.module';

@NgModule({
  imports: [
    CommonModule,
    SideBarModule,
    MediaPlayerModule,
    HeaderUserModule
  ],
  exports: [
    SideBarModule,
    MediaPlayerModule,
    HeaderUserModule
  ]
})
export class SharedModule {}
