package tipoTarjetas;

public class Visa extends Tarjeta {
	
	public Visa (int descuento) {
		super(descuento);
	}
	
	public float aplicarDescuento(float totalComida, float totalBebida) {
		float a = totalBebida * ((float) descuentoPorcentaje / 100);
		System.out.println(a);
		return totalBebida * ((float) descuentoPorcentaje / 100);
	}
}
