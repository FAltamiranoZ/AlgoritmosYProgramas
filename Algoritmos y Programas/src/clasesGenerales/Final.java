package clasesGenerales;

import java.util.ArrayList;

public class Final {
	
	public static ArrayList<Integer> problema3 (int arre[], int TE, int num){
		ArrayList<Integer> a=new ArrayList<Integer>();
		int i;
		for(i=0; i<TE; i++){
			if(arre[i]%num==0)
				a.add(arre[i]);
		}
	return a;
	}
	
	public static boolean problema4 (int arre[], int TE){
		boolean var=true;
		int i, w;
		i=0;
		w=1;
		while(var==true&&i<((TE-1)/2)){
			if(arre[i]==arre[TE-(w+i)])
				var=true;
			else
				var=false;
			i=i+1;
		}
		return var;
	}
	
	public static void main(String[] args) {
		int arreglo[]={2, 13, 6, 17, 4};
		int arreglo2[]={4, 5, 5, 4, 3};
		System.out.println(Final.problema3(arreglo, 5, 2));
		System.out.println(Final.problema4(arreglo2, 5));
	}
}
