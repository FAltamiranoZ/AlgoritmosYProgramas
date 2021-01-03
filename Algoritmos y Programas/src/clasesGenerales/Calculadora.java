package clasesGenerales;

public class Calculadora {
	public static double multiplica(double m, double n){
		int i;
		double suma;
		suma=0;
		for(i=1;i<=n;i++)
			suma=suma+m;
		return suma;
	}
	public static double potencia(double m, double n){
		int i;
		double suma, resultado, j;
		suma=0;
		resultado=0;
		j=m;
		if (n==1)
				resultado=m;
		else
			if(n==2){
				suma=(multiplica(m, m));
				resultado=suma*1;
			}
			else
				for (i=3;i<=n; i++){
					suma=(multiplica(m, m));
					resultado=(multiplica(suma, j));
					j=j+m;
				}
		return resultado;
	}
	public static String calUllman(int n){
		StringBuilder cad=new StringBuilder ("Serie de Ullman:\n");
		cad.append(n).append(", ");
		while(n!=1){
			if(n%2==0)
				n=n/2;
			else
				n=n*3+1;
			cad.append(n).append(", ");
		}
		return cad.toString();
	}
	public static int calFactorial(int n){
		int fact, i;
		fact=1;
		for(i=n;i>=2;i--){
			fact=fact*i;
		}
		return fact;
	}
	public static int calMCD(int m, int n){
		int respaldo;
		while(n!=0){
			respaldo=n;
			n=m%n;
			m=respaldo;
		}
		return m;
	}
	public static String calFibonacci(int n){
		int i, primero, segundo, fibonacci;
		primero=0;
		segundo=1;
		StringBuilder res=new StringBuilder ("Serie de Fibonacci:\n");
		switch (n){
		case 1: res.append("0\n");
		break;
		case 2: res.append("0, 1\n");
		break;
		default: res.append("0, 1, ");
			for(i=3;i<=n;i++){
			fibonacci=primero+segundo;
			res.append(fibonacci).append(", ");
			primero=segundo;
			segundo=fibonacci;
		}
		}
		return res.toString();
	}
	public static String generaCubosNicómaco(int n){
		int impar, i, suma, j;
		StringBuilder res=new StringBuilder ("Cubo de Nicómaco:\n");
		impar=1;
		for(i=1;i<=n;i++){
			suma=0;
			for(j=1;j<=i;j++){
				suma=suma+impar;
				impar=impar+2;
			}
			res.append(suma).append(" ");
		}
		return res.toString();
	}
	public static double calSerie2(int n, int num){
		double serie;
		int i, divisor;
		serie=0;
		divisor=3;
		for(i=1;i<=n;i++){
			serie=serie+num/divisor;
			divisor=divisor+2;
			if(divisor>7)
				divisor=3;
		}
		return serie;
	}
	public static double calSerie3(int n){
		int i;
		double serie;
		serie=0;
		for(i=0;i<=n;i++)
			serie=serie+calFactorial(n-i)/calFactorial(i);
		return serie;
	}
	public static double calSerie1(int n){
		int i;
		double total;
		total=0;
		for(i=1;i<=n;i++){
			total=total+potencia(i, i);
		}
		return total;
	}
}