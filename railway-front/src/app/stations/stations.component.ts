import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Station } from '../models/station';
import { StationService } from '../services/station.service';

@Component({
  selector: 'app-stations',
  templateUrl: './stations.component.html',
  styleUrls: ['./stations.component.css']
})
export class StationsComponent implements OnInit {

  public stations: Station[] = [];
  constructor(private StationService: StationService) { }

  ngOnInit(): void {
    this.getStations();
  }

  public getStations(): void {
    this.StationService.getStations().subscribe(
      (response: Station[]) => 
      
      {
        this.stations = response;
        console.log(response)
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    )
  }

}
