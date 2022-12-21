import { Component } from '@angular/core';
import { StationService } from './services/station.service';
import { Station } from './models/station';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'railway-front';
}
