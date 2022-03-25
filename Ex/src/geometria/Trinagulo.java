package geometria;

public class Trinagulo {
	// Atributos
	private double base;
	private double altura;
	
	// Métodos
	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		}
	}
	
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	
	public double calculaArea() {
		double area = (base * altura) / 2;
			
		return area; 
	}
	
	public void desenhar() {
		for (int i = 1; i < altura; i++) {
			for (int j = 1; j < base; j++) {
					System.out.print(". ");
			}
			System.out.println("");
		}
	}
}
