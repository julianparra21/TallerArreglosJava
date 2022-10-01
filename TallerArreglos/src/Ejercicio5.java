import javax.swing.JOptionPane;

public class Ejercicio5 {
	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de caracteres que desea insertar"));
	int numeros[]=new int[n];
	int num=0,cont=0,pos=0,cant=0;
	 
	do {
		num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		cont=0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]==num) {
				cont++;
			}
		}
		if (cont==0) {
			numeros[pos]=num;
			System.out.println(numeros[pos]+" ");
			pos++;
			cant++;
		}else {
			JOptionPane.showMessageDialog(null, "El numero esta repetido");
		}
	} while (cant<n);
		
	}
}
