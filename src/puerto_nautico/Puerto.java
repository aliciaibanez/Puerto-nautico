package puerto_nautico;

public class Puerto {

	private static final int MAX_AMARRES = 4;
	private Alquiler[] amarres = new Alquiler[MAX_AMARRES];

	public double alquilarAmarre(int numeroDias, Barco barco) {
		double valorARetornar = 0;
		for (int i = 0; i < MAX_AMARRES; i++) {
			if (amarres[i] == null) {
				amarres[i] = new Alquiler(numeroDias, barco);
				valorARetornar = amarres[i].getPrecio();
				break;
			} else {
				valorARetornar = -1;
			}
		}
		return valorARetornar;
	}

	public double liquidarAlquilerAmarre(int posicion) {
		 if (posicion < 0 || posicion >= MAX_AMARRES || amarres[posicion] == null) {
		        return -1; 
		 }
		    double precio = amarres[posicion].getPrecio();
		    amarres[posicion] = null;
		    return precio;
    }

	public void verEstadoAmarres() {
		if (amarres != null )
		System.out.println();
	}
}
