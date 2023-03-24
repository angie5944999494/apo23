package desrrollo;


	import java.util.Scanner;
	
	
	public class Punto7 {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] nt= new double [5];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese nota de la prueba numero 1");
		nt[0]=scanner.nextDouble();
		System.out.println("ingrese nota de la prueba numero 2");
		nt[1]=scanner.nextDouble();
		System.out.println("ingrese nota de la prueba numero 3");
		nt[2]=scanner.nextDouble();
		System.out.println("ingrese nota de la prueba numero 4");
		nt[3]=scanner.nextDouble();
		System.out.println("ingrese nota de la prueba numero 5");
		nt[4]=scanner.nextDouble();
		
		double sum=0;
		double prom;
		for (int i = 0; i < nt.length; i++) {
		
			sum += nt[i];
			
		}
		
		
		prom = sum / nt.length;
		
		
		System.out.println("promedio de notas de la pruba fue: " + prom);
		
		
		
		
	}

}
