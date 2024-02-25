package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttBuilder {
	public static IMqttClient buildClient() throws Exception {
		MqttClient connectedClient = new MqttClient(MyConstants.URI_BROKER, "Client_489");
		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect( true );
		opts.setCleanSession( true );
		opts.setConnectionTimeout( 10 );
		connectedClient.connect( opts );
		
		return connectedClient;
	}
	public static MqttMessage buildMessage(String key, double value) {
		String valueStr = String.format("%04.2f", value);
		byte[] payload = String.format("%s:%s", key, valueStr).getBytes();
		
		return new MqttMessage( payload );
	}
}
