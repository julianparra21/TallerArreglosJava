import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
		int[]arreglo=new int [n];
		int suma=0;
		
		for (int i = 0; i <n; i++) {
			arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero que no sea negativo ni mayor de 10"));
			
			if (arreglo[i]>-1 && arreglo[i]<10) {
				suma=suma+arreglo[i];
				
			}else {
				System.out.println("Es numero es invalido");
				arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo y menor o igual a 10"));
				break;
			}
			
		}
		System.out.println("La suma final de los numeros ingresados es: "+suma);
	}

}
