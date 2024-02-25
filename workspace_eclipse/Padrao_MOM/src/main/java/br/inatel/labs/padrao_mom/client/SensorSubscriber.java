package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

public class SensorSubscriber {

	public static void main(String[] args) throws MqttSecurityException, MqttException {
		
		//1.criar o subscriber
		String subscriberId = "Subscriber_316";//colocar sua matricula
		MqttClient subscriber = new MqttClient( MyConstants.URI_BROKER, subscriberId );
		
		//2.conectar ao broker
		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect( true );
		opts.setCleanSession( true );
		opts.setConnectionTimeout( 10 );
		subscriber.connect(opts);
		
		//3.assinar e esperar por mensagens:
		subscriber.subscribe(MyConstants.TOPIC_SENSOR, (topic, msg) -> {
		System.out.println("Mensagem recebida: [" + msg + "] do tópico: " + topic);
		});
	}
}
