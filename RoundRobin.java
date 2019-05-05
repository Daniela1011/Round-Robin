package rouro;
import java.util.Scanner;
public class RoundRobin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int prom,qua,tm,resul,tiempoFinal=0,count=0;
		float tprom=0,suma=0;
		int tiempo[]=new int [5];
		int tFin[]=new int[5];
		String []procesos =new String[5];
		procesos[0]="a";
		procesos[1]="b";
		procesos[2]="c";
		procesos[3]="d";
		procesos[4]="e";
		for (int i=0;i<5;i++){
			String l=procesos[i];
			System.out.println("Inserte el tiempo en el proceso "+"["+l+"]:");
			tm=Integer.parseInt(s.nextLine());
			tiempo[i]=tm;
		}
		qua=0;
		int sum=0;
		for(int j=0;j<5;j++){
			sum=sum+tiempo[j];
			prom=sum/5;
			qua=+prom;
		}
		System.out.println("El quantum es de "+qua);
		int k=tiempo.length;
		int i=0;
		while (count<k){
				System.out.println("I="+i);
				for (int j=0;j<tiempo.length;j++){
					System.out.print(tiempo[j]+"|");
					System.out.print("");
				}
				System.out.println("");
				System.out.println("Tiempo"+"["+i+"] = "+tiempo[i]);
					if(tiempo[i]!=0){
						resul=tiempo[i]-qua;
						System.out.println("Tiempo Final"+"["+i+"] = "+resul);
						tiempo[i]=resul;
					if(resul<0){
						tiempoFinal=tiempoFinal+qua+tiempo[i];
						suma=suma+tiempoFinal;
						count++;
						tFin[i]=tiempoFinal;
						System.out.println("El tiempo del proceso de "+procesos[i]+":"+tiempoFinal);
					}
					else if(resul>0){
						tiempoFinal=tiempoFinal+qua;
					}
				}
			System.out.println("Sumatoria="+suma);
			System.out.println("");
			i++;
			if (i>4){
				i=0;
			}
		}
		tprom=suma/5;
		System.out.println("Tiempo promedio de los procesos: "+tprom);
	}
}
