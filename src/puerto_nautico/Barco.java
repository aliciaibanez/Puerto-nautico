package puerto_nautico;

public abstract class Barco {
	private String matricula;
	private double eslora;
	private int anoFabricacion;
	private Persona propietario;

	public Barco(String matricula, double eslora, int anoFabricacion, Persona propietario) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anoFabricacion = anoFabricacion;
		this.propietario = propietario;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public abstract int getCoeficienteBernua();

	public String toString() {
		StringBuilder detalleBarco = new StringBuilder();
		detalleBarco.append(getMatricula()).append(", ").append(getEslora()).append(", ").append(getAnoFabricacion())
				.append(", ").append(getPropietario());
		return detalleBarco.toString();

	}
}
