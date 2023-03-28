package TestConcurso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Main.Concurso;
import Main.Participante;

public class TestConcurso {
	@Test
	public void inscribirse () {

		 Participante participante1 = new Participante("Juan", 0);
	        Participante participante2 = new Participante("Ana", 0);
	        Concurso concurso = new Concurso("Concurso de dibujo", LocalDate.now(), LocalDate.of(2022, 4, 30));
	        
	        boolean resultadoEsperado = true;
	        
	        assertEquals(resultadoEsperado, concurso.inscribirParticipante(participante1));
	}
}
