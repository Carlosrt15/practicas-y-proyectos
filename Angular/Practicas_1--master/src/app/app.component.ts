import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'spotify-a';
  
  status: string | number = 'fail'

  car: CarModel = {
    brand: 'Ford',
    model: 'Focus',
    year: 2021
  }

  listCars: Array<CarModel> = [
    {
      brand: 'Ferrari',
      model: 't20',
      year: 2019
    },
    {
      brand: 'BMW',
      model: 'M2',
      year: 2016
    },
  ]
}

interface CarModel {
  brand: string;
  model: string;
  year?: number;
}
