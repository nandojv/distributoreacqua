package corsoiniziodacapo;

import java.util.Scanner;

public class acqua {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int acqua=0;

String gas1="poco frizzante";
String gas2="frizzante";
String gas3="molto frizzante";
String gas4="non gasata";

do {
	Scanner a = new Scanner(System.in);
	
	System.out.println("scegli gas:1 ,2,3 ,4 "); 
	
	 acqua =a.nextInt(); 

	 if(acqua==0);{
		 
		 if(acqua==1) {
		 System.out.println(acqua +" " +gas1+ "  ");
		 }
	 
		 else if(acqua==2) {
			 System.out.print(acqua+"  "+gas2+ "");
		 }
		 else if(acqua==3) {
			 System.out.print(acqua+"  "+gas3 +    "");
			 
		 }
		 
		 else if(acqua==4) {
			 
			 System.out.print(acqua+"  "+gas4 +   "");
		 }
	
           
	 
	 }
	 
		 System.out.println(" \n  buona\n bevuta");
	 

}




	

	while(acqua !=0);
	}

}
