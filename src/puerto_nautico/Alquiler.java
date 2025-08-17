package puerto_nautico;

public class Alquiler {
	private int numeroDias;
	private Barco barco;

	public Alquiler(int numDias, Barco barco) {
		this.numeroDias = numDias;
		this.barco = barco;

	}

	public Barco getBarco() {
		return barco;

	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public double getPrecio() {

		double precioFinal = 0;

		if (getBarco() instanceof Velero velero) {
			precioFinal = (getNumeroDias() * (10 * velero.getEslora())) + 300 * (velero.getCoeficienteBernua());
			
		} else if (getBarco() instanceof Yate yate) {
			precioFinal = (getNumeroDias() * (10 * yate.getEslora()))
					+ 300 * (yate.getCoeficienteBernua());
			
		} else if (getBarco() instanceof EmbarcacionAMotor embarcacionAMotor) {
			precioFinal = (getNumeroDias() * (10 * embarcacionAMotor.getEslora()))
					+ 300 * (embarcacionAMotor.getCoeficienteBernua());
		}

		return precioFinal;
	}

	public String toString() {
		return toString();
	}
}
