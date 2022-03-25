package geometria;

public class Main {
	
	// Teste da classe Quadrado
	Quadrado primeiroQuadrado = new Quadrado();
	primeiroQuadrado.setLado(12);
	
	double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
	System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
	
	System.out.println("Desenho quadrado: ");
	primeiroQuadrado.desenhar();
	
	// Teste da classe Retangulo
	Quadrado primeiroRetangulo = new Retangulo();
	primeiroRetangulo.setLado(12);
				
	double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
	System.out.println("Area quadrado: " + areaPrimeiroRetangulo);
				
	System.out.println("Desenho quadrado: ");
	primeiroRetangulo.desenhar();
	
	// Teste da classe Triangulo
	Quadrado primeiroTriangulo = new Triangulo();
	primeiroTriangulo.setLado(12);
				
	double areaPrimeiroTriangulo = primeiroTriangulo.calculaArea();
	System.out.println("Area quadrado: " + areaPrimeiroTriangulo);
				
	System.out.println("Desenho quadrado: ");
	primeiroTriangulo.desenhar();
	
	// Teste da classe Circulo
	Quadrado primeiroCirculo = new Circulo();
	primeiroCirculo.setLado(12);
				
	double areaPrimeiroCirculo = primeiroQuadrado.calculaArea();
	System.out.println("Area quadrado: " + areaPrimeiroCirculo);
				
	System.out.println("Desenho quadrado: ");
	primeiroCirculo.desenhar();
}
