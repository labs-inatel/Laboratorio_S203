import { Component, OnDestroy, OnInit } from '@angular/core';
import { MqttService, IMqttMessage } from 'ngx-mqtt';
import { IMsg } from '../../models/i-msg';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit, OnDestroy {
  TOPIC_SMARTCAMPUS = 'smartcampus/poste/#';
  msgList: IMsg[] = [];

  constructor(private mqttService: MqttService) {}

  ngOnInit(): void {
    try {
      this.mqttService.observe( this.TOPIC_SMARTCAMPUS ).subscribe( (mqttMessage : IMqttMessage ) => {
        const msg : IMsg = {
          id: mqttMessage.messageId,
          topic: mqttMessage.topic,
          content: mqttMessage.payload.toString()
        };
        this.msgList.push( msg );
      });
    }catch( err ) {
      console.error( 'Error ao assinar topico: ' + err );
    }
  }

  ngOnDestroy(): void {
    this.mqttService.disconnect();
  }


}
