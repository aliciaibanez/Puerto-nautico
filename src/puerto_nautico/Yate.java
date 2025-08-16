package puerto_nautico;

public class Yate extends EmbarcacionAMotor {
	private int numCamarotes;

	public Yate(String matricula, double eslora, int anoFabricacion, Persona propietario, int potencia,
			int numCamarotes) {
		super(matricula, eslora, anoFabricacion, propietario, potencia);
		this.numCamarotes = numCamarotes;
	}

	public int getNumCamarotes() {
		return numCamarotes;
	}

	public int getCoeficienteBernua() {
		return super.getCoeficienteBernua() + numCamarotes;

	}

	@Override
	public String toString() {
		StringBuilder detalleYate = new StringBuilder();
		detalleYate.append(super.toString()).append(", ").append(getNumCamarotes());
		return detalleYate.toString();

	}

}
