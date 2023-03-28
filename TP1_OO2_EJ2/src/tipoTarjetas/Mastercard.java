package tipoTarjetas;

public class Mastercard extends Tarjeta {
	
	public Mastercard (int descuento) {
		super(descuento);
	}
	
	public float aplicarDescuento(float totalComida, float totalBebida) {
		return totalComida * ((float) descuentoPorcentaje / 100);
	}
}
