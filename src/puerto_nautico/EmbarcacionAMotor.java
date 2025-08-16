package puerto_nautico;

public class EmbarcacionAMotor extends Barco {
	private int potencia;

	public EmbarcacionAMotor(String matricula, double eslora, int anoFabricacion, Persona propietario, int potencia) {
		super(matricula, eslora, anoFabricacion, propietario);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	@Override
	public int getCoeficienteBernua() {
		return potencia;

	}

	@Override
	public String toString() {
		StringBuilder detalleEmbarcacionAMotor = new StringBuilder();
		detalleEmbarcacionAMotor.append(super.toString()).append(", ").append(getPotencia());
		return detalleEmbarcacionAMotor.toString();

	}
}
