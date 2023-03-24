package desrrollo;

	import java.util.Scanner;

	public class Punto8 {

	    static int[][] a = new int[3][3];
	    static int[][] b = new int[3][3];

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char choice;
	        do {
	            System.out.println("A. arreglo  A");
	            System.out.println("B. Arreglo B");
	            System.out.println("C. pantalla A + B");
	            System.out.println("D. pantalla A - B");
	            System.out.println("E. pantalla A * B");
	            System.out.println("F. salir");

	            choice = sc.next().charAt(0);
	            switch (choice) {
	                case 'A':
	                    a = getArreglo();
	                    break;
	                case 'B':
	                    b = getArreglo();
	                    break;
	                case 'C':
	                    printArreglo(add(a, b));
	                    break;
	                case 'D':
	                    printArreglo(subtract(a, b));
	                    break;
	                case 'E':
	                    printArreglo(multiply(a, b));
	                    break;
	                case 'F':
	                    System.out.println("chao!");
	                    break;
	                default:
	                    System.out.println("opcion incorrecta. Por favor intentelo de nuevo");
	            }
	        } while (choice != 'F');
	    }

	    static int[][] getArreglo() {
	        Scanner sc = new Scanner(System.in);
	        int[][] arreglo = new int[3][3];
	        System.out.println("ingrese los valores de los arreglos:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                arreglo[i][j] = sc.nextInt();
	            }
	        }
	        return arreglo;
	    }

	    static int[][] add(int[][] a, int[][] b) {
	        int[][] sum = new int[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        return sum;
	    }

	    static int[][] subtract(int[][] a, int[][] b) {
	        int[][] difference = new int[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                difference[i][j] = a[i][j] - b[i][j];
	            }
	        }
	        return difference;
	    }

	    static int[][] multiply(int[][] a, int[][] b) {
	        int[][] product = new int[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                product[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
	            }
	        }
	        return product;
	    }

	    static void printArreglo(int[][] arreglo) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(arreglo[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}