package Main;

public class Participante {
	public String nombre;
	public int puntos;
	public Participante (String nombre,int puntos) {
		this.nombre = nombre;
		this.puntos = puntos;
	}
	public void sumarPuntos(int cantidad) {
        puntos += cantidad;
    }
    
    public int getPuntos() {
        return puntos;
    }
	public String getNombre() {
		return nombre;
	}

	
   }

