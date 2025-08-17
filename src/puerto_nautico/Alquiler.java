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
	    double precioFinal = getNumeroDias() * (10 * getBarco().getEslora());

	    if (getBarco() instanceof Velero) {
	        Velero velero = (Velero) getBarco();
	        precioFinal += 300 * velero.getNumeroMastiles();
	    } 
	    else if (getBarco() instanceof Yate) {
	        Yate yate = (Yate) getBarco();
	        precioFinal += 300 * (yate.getPotencia() + yate.getNumCamarotes());
	    }
	    else if (getBarco() instanceof EmbarcacionAMotor) {
	    	EmbarcacionAMotor deportivo = (EmbarcacionAMotor) getBarco();
	        precioFinal += 300 * deportivo.getPotencia();
	    } 
	    
	    

		return precioFinal;
	}

	public String toString() {
		return toString();
	}
}
