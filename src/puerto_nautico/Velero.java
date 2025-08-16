package puerto_nautico;

public class Velero extends Barco {
	private int numMastiles;

	public Velero(String matricula, double eslora, int anoFabricacion, Persona propietario, int numMastiles) {
		super(matricula, eslora, anoFabricacion, propietario);
		this.numMastiles = numMastiles;
	}

	public int getNumeroMastiles() {
		return numMastiles;

	}

	@Override
	public int getCoeficienteBernua() {
		return numMastiles;

	}

	@Override
	public String toString() {
		StringBuilder detalleVelero = new StringBuilder();
		detalleVelero.append(super.toString()).append(", ").append(getNumeroMastiles());
		return detalleVelero.toString();

	}
}
