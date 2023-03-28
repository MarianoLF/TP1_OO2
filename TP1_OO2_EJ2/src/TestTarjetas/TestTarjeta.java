package TestTarjetas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Modelo.Bebida;
import Modelo.Pedido;
import Modelo.Plato;
import tipoTarjetas.ComarcaPlus;
import tipoTarjetas.Mastercard;
import tipoTarjetas.Tarjeta;
import tipoTarjetas.Viedma;
import tipoTarjetas.Visa;

public class TestTarjeta {
@Test
	public void pagarConVisa () {
		//Creamos los platos y bebidas
				Plato plato1 = new Plato(950, "Pastel de papa");
				Plato plato2 = new Plato(1300, "Milanesas con pure");
				Plato plato3 = new Plato(900, "Pizza");
				Bebida bebida1 = new Bebida(300, "Gaseosa");
				Bebida bebida2 = new Bebida(300, "Agua saborizada");
				Bebida bebida3 = new Bebida(250, "Agua"); 
				
				//Agregamos platos y bebidas a la lista
				List<Plato> comidaPedida = new ArrayList<>();
				comidaPedida.add(plato1);
				comidaPedida.add(plato2);
				comidaPedida.add(plato3);
				List<Bebida> bebidaPedida = new ArrayList<>();
				bebidaPedida.add(bebida1);
				bebidaPedida.add(bebida2);
				bebidaPedida.add(bebida3);
				
				//Creamos el perdido
				Pedido nuevoPago = new Pedido(comidaPedida, bebidaPedida);

				//Creamos la tarjeta Visa
				Tarjeta tarjeta = new Visa(3);
				
				float resultadoEsperado = 3974 ;
				assertEquals(resultadoEsperado, nuevoPago.pedirCuenta(tarjeta, 0));
	}

	public void pagarConMastercard () {
		//Creamos los platos y bebidas
		Plato plato1 = new Plato(950, "Pastel de papa");
		Plato plato2 = new Plato(1300, "Milanesas con pure");
		Plato plato3 = new Plato(900, "Pizza");
		Bebida bebida1 = new Bebida(300, "Gaseosa");
		Bebida bebida2 = new Bebida(300, "Agua saborizada");
		Bebida bebida3 = new Bebida(250, "Agua"); 
		
		//Agregamos platos y bebidas a la lista
		List<Plato> comidaPedida = new ArrayList<>();
		comidaPedida.add(plato1);
		comidaPedida.add(plato2);
		comidaPedida.add(plato3);
		List<Bebida> bebidaPedida = new ArrayList<>();
		bebidaPedida.add(bebida1);
		bebidaPedida.add(bebida2);
		bebidaPedida.add(bebida3);
		
		//Creamos el perdido
		Pedido nuevoPago = new Pedido(comidaPedida, bebidaPedida);
	
		//Creamos la tarjeta Visa
		Tarjeta tarjeta = new Mastercard(2);
		
		float resultadoEsperado = 3905;
		assertEquals(resultadoEsperado, nuevoPago.pedirCuenta(tarjeta, 0));
	}
	
	public void pagarConComarcaPlus () {
		//Creamos los platos y bebidas
			Plato plato1 = new Plato(950, "Pastel de papa");
			Plato plato2 = new Plato(1300, "Milanesas con pure");
			Plato plato3 = new Plato(900, "Pizza");
			Bebida bebida1 = new Bebida(300, "Gaseosa");
			Bebida bebida2 = new Bebida(300, "Agua saborizada");
			Bebida bebida3 = new Bebida(250, "Agua"); 
			
			//Agregamos platos y bebidas a la lista
			List<Plato> comidaPedida = new ArrayList<>();
			comidaPedida.add(plato1);
			comidaPedida.add(plato2);
			comidaPedida.add(plato3);
			List<Bebida> bebidaPedida = new ArrayList<>();
			bebidaPedida.add(bebida1);
			bebidaPedida.add(bebida2);
			bebidaPedida.add(bebida3);
			
			//Creamos el perdido
			Pedido nuevoPago = new Pedido(comidaPedida, bebidaPedida);
	
			//Creamos la tarjeta Visa
			Tarjeta tarjeta = new ComarcaPlus(2);
			
			float resultadoEsperado = 3880;
			assertEquals(resultadoEsperado, nuevoPago.pedirCuenta(tarjeta, 0));
	}
	
	public void pagarConViedma () {
		//Creamos los platos y bebidas
				Plato plato1 = new Plato(950, "Pastel de papa");
				Plato plato2 = new Plato(1300, "Milanesas con pure");
				Plato plato3 = new Plato(900, "Pizza");
				Bebida bebida1 = new Bebida(300, "Gaseosa");
				Bebida bebida2 = new Bebida(300, "Agua saborizada");
				Bebida bebida3 = new Bebida(250, "Agua"); 
				
				//Agregamos platos y bebidas a la lista
				List<Plato> comidaPedida = new ArrayList<>();
				comidaPedida.add(plato1);
				comidaPedida.add(plato2);
				comidaPedida.add(plato3);
				List<Bebida> bebidaPedida = new ArrayList<>();
				bebidaPedida.add(bebida1);
				bebidaPedida.add(bebida2);
				bebidaPedida.add(bebida3);
				
				//Creamos el perdido
				Pedido nuevoPago = new Pedido(comidaPedida, bebidaPedida);
	
				//Creamos la tarjeta Visa
				Tarjeta tarjeta = new Viedma();
				
				float resultadoEsperado = 4000;
				assertEquals(resultadoEsperado, nuevoPago.pedirCuenta(tarjeta, 0));
	}
}
