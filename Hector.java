import java.util.*;
public class AreaCirculo2
{
private double rad,a;
public void iniciar(){
Scaneer obj=new Scanner(System.in);
System.out.println("ingresa radio del circulo");
rad=obj.nextDouble();
}
public void area(){
a=((rad*rad)*3.1416);
}
public void imprimir(){
System.out.println("el area del circulo es ="+a);
}
public static void main (String [] args){
		AreaCirculo2 obj= new AreaCirculo2();
		obj.iniciar();
		obj.area();
		obj.imprimir();
	}
}
