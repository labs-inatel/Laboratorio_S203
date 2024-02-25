import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {IMqttServiceOptions, MqttModule } from 'ngx-mqtt';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';

const MQTT_SERVICE_OPTIONS : IMqttServiceOptions = {
  hostname: 'localhost',
  port: 8083,
};

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MqttModule.forRoot(MQTT_SERVICE_OPTIONS)

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
