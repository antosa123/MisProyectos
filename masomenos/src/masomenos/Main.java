package masomenos;

public class Main {
	static boolean noHayaAcertado=true;
	public static void main(String[] args) {
		int n1;
		int resultado=50;
		while (noHayaAcertado){
		System.out.print("Introduce un n�mero: ");
		n1 = Entrada.entero();
		
		if (resultado > n1)
			System.out.println("El n�mero que buscamos es mayor que " + n1);
		else
			if (resultado < n1)
			System.out.println("El n�mero que buscamos es menor que " + n1);
			else { noHayaAcertado=false;
				System.out.println("�Has acertado el n�mero!");
			}
		}
	}
}