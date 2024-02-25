package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.IMqttClient;

public class SensorPublisher {
	
	public static void main(String[] args) throws Exception{
		//1.criar o publisher:
		String publisherId = "Publicador_316"; //colocar sua matricula aqui
		IMqttClient publisher = new MqttClient(MyConstants.URI_BROKER, publisherId);
		
		//2.conectar ao broker
		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect( true );
		opts.setCleanSession( true );
		opts.setConnectionTimeout( 10 );
		publisher.connect( opts );
		
		//3.criar mensagem com leitura do sensor:
		Sensor sensor = new Sensor();
		
		
		for(int i=0;i<100;i++) {
			double temperatura = sensor.readTemp();
			MqttMessage message = createMessage(temperatura);
			
			//4.publicar no topic
			publisher.publish(MyConstants.TOPIC_SENSOR, message);
			
			Thread.sleep(2000);
		}
	
		//5. desconectar
		publisher.disconnect();
	}
	
	private static MqttMessage createMessage(double value) {
		byte[] payload = String.format("T:%04.2f", value).getBytes();
		return new MqttMessage( payload );
	}




}
