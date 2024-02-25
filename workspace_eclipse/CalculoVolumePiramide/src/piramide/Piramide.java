package piramide;
import java.util.Scanner;

public class Piramide {
	 private double base;
	    private double altura;

	    public Piramide(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    public double exibirVolume() {
	        double volume = (1.0 / 3.0) * (base * base) * altura;
	        return volume;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe o valor da base da piramide: ");
	        double base = scanner.nextDouble();

	        System.out.print("Informe o valor da altura da piramide: ");
	        double altura = scanner.nextDouble();

	        Piramide piramide = new Piramide(base, altura);
	        double volume = piramide.exibirVolume();

	        String volumeFormatado = String.format("%.2f", volume);

	        System.out.println("O volume da piramide eh " + volumeFormatado);

	        scanner.close();
	    }
}
