import javax.swing.JOptionPane;

//Haga un arreglo que permita almacenar el valor de 5 números enteros y obtenga la sumatoria.
public class Ejercicio1 {

	public static void main(String[] args) {
		int arreglo[]=new int[5];
		System.out.println("infrese el valor que quiere almacenar en los arreglos");
		arreglo[0]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero entero"));
		arreglo[1]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero entero"));
		arreglo[2]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero entero"));
		arreglo[3]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el cuarto numero entero"));
		arreglo[4]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el quinto numero entero"));
		int suma= arreglo[0]+ arreglo[1]+arreglo[2]+arreglo[3]+arreglo[4];
		System.out.println("la sumatoria de los numeros ingresados es: "+suma);
	}

}
