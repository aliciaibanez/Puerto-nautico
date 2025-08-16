package puerto_nautico;

public class Persona {
	private String nombre;
	private String dni;

	public Persona(String nombre, String dni) {

		this.nombre = nombre;
		this.dni = dni;

	}

	public String getNombre() {

		return nombre;

	}

	public String getDni() {

		return dni;

	}

	public String toString() {

		StringBuilder detallePersona = new StringBuilder();
		detallePersona.append(nombre).append(", ").append(dni);

		return detallePersona.toString();

	}
}
