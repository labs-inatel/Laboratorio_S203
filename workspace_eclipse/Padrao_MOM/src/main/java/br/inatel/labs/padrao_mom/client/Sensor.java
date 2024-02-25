package br.inatel.labs.padrao_mom.client;

import java.util.Random;

public class Sensor {
	public double readTemp() {
		double value = new Random().doubles(-40, 80)
		.findAny()
		.getAsDouble();
		return value;
	}
	public double readVoltage() {
		return new Random().doubles(0, 380)
		.findAny()
		.getAsDouble();
	}
	public double readCurrent() {
		return new Random().doubles(0, 60)
		.findAny()
		.getAsDouble();
	}
	public double readCorrente() {
		// TODO Auto-generated method stub
		return 0;
	}
}
