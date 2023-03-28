package tipoTarjetas;

public abstract class Tarjeta {
	protected int descuentoPorcentaje;

    Tarjeta(int descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public Tarjeta() {
        this.descuentoPorcentaje = 0;
    }

    public float calcularCosto(float precioPlatos, float precioBebidas, int porcentajePropina) {
        float precioTotal = precioPlatos + precioBebidas;
        float propina = precioTotal * ((float) porcentajePropina / 100);
        float descuento = aplicarDescuento(precioTotal);
        precioTotal = precioTotal + propina - descuento;
        return precioTotal;
    }

    public float aplicarDescuento(float precioTotal) {
        return precioTotal * ((float) descuentoPorcentaje / 100);
    }
}
