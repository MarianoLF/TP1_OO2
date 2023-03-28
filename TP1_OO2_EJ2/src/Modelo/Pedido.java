package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import tipoTarjetas.Tarjeta;

public class Pedido {
	private final List<Plato> platos;
    private final List<Bebida> bebidas;
    
    public Pedido(List<Plato> platos, List<Bebida> bebidas) {
        this.platos = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }
    
    public float pedirCuenta(Tarjeta tarjeta, int porcentajePropina) {
        float total = calcularTotal();
        float cuenta = tarjeta.calcularCosto(total, 0, porcentajePropina);
        String texto = LocalDate.now() + " || " + cuenta; 
        return cuenta;
    }

    private float calcularTotal() {
        float total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        for (Bebida bebida : bebidas) {
            total += bebida.getPrecio();
        }
        return total;
    }
}
    
   

