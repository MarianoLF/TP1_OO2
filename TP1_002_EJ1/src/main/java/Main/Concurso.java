package Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
	public String nombre;
	public LocalDate fInicioInscripcion;
	public LocalDate fFinInscripcion;
	private List<Participante> participantes;

	public Concurso (String nombre,LocalDate fInicioInscripcion,LocalDate fFinInscripcion) {
		this.nombre = nombre;
		this.fInicioInscripcion = LocalDate.now();
		this.fFinInscripcion = LocalDate.now();
		this.participantes = new ArrayList<Participante>();
	}
	
	public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicioInscripcion() {
        return fInicioInscripcion;
    }

    public LocalDate getFechaFinInscripcion() {
        return fFinInscripcion;
    }

    public boolean inscribirParticipante(Participante participante) {
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isAfter(fFinInscripcion) || fechaActual.isBefore(fInicioInscripcion)) {
            //System.out.println("La inscripción no está abierta en este momento.");
            return false;
        }
        if (fechaActual.equals(fInicioInscripcion)) {
            participante.sumarPuntos(10);
        }
        participantes.add(participante);
        return true;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
