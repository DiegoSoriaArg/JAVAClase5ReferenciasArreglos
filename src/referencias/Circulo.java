package referencias;

public class Circulo {
	
	private double radio;

	public Circulo(double radio) {
		this.setRadio(radio);
	}
	
	public Circulo() {
		this(1.0);
	}
	
	public void setRadio(double radio) {
		if (radio <= 0)
			throw new Error("Radio Invalido");
		this.radio = radio;
	}
	
	public void setDiametro(double diametro) {
		setRadio(diametro / 2);
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double getDiametro() {
		return this.getRadio() * 2;
	}
	
	public double getPerimetro() {
		return this.getDiametro() * Math.PI;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

}
