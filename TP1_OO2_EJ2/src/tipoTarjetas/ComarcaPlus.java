package tipoTarjetas;

public class ComarcaPlus extends Tarjeta {
	public ComarcaPlus(int descuento) {
		super(descuento);
	}
	public float aplicarDescuento(float totalComida, float totalBebida) {
		return (totalComida + totalBebida) * ((float) descuentoPorcentaje / 100);
	}
}
