package friedman.ACMMicroprocessorSimulation;

import java.util.Scanner;

public class microp {

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);
		String[] whole = console.nextLine().split("");
		String word;
		String hi;
		String lo;
		int loc = 0;
		String regA = "";
		String regB = "";
		int ct = 0;

		do{
			word = whole[ct];
			ct++;

			switch(word){
			case "0":{
				hi = whole[ct];
				ct++;
				lo = whole[ct];
				ct++;
				loc = Integer.parseInt(hi+lo,16);
				regA = whole[loc].toUpperCase();
				break;
			}
			case "1":{
				hi = whole[ct];
				ct++;
				lo = whole[ct];
				ct++;
				loc = Integer.parseInt(hi+lo,16);
				whole[loc] = regA;
				break;
			}
			case "2":{
				String temp = regA;
				regA = regB.toUpperCase();
				regB = temp.toUpperCase();
				break;
			}
			case "3":{
				/*int A =  Integer.parseInt(regA, 16);
				int B =  Integer.parseInt(regB, 16);
				int sum = A + B;
				String hex = Integer.toHexString(sum);
				hex = hex.toUpperCase();
				if (hex.length() == 1) {
					hex = "0" + hex;
				}
				regB = String.valueOf(hex.charAt(0));

				regA = String.valueOf(hex.charAt(1));
				ct++;*/
				
				int sumDec = Integer.parseInt(regA, 16); 
				if(!regB.equals("")){
					sumDec+=Integer.parseInt(regB, 16);
				}
				String sumHex = Integer.toHexString(sumDec);
				regB = String.valueOf(sumHex.charAt(0)).toUpperCase();
				if(sumHex.length() > 1){
					regA = String.valueOf(sumHex.charAt(1)).toUpperCase();
				}
				break;
			}
			case "4":{
				int temp = Integer.parseInt(regA,16);
				if(temp == 15){
					temp = 0;
				}
				else{
					temp++;				
				}
				regA = Integer.toHexString(temp).toUpperCase();	
				break;
			}
			case "5":{
				int temp = Integer.parseInt(regA,16);
				if(temp == 0){
					temp = 15;
				}
				else{
					temp--;				
				}
				regA = Integer.toHexString(temp).toUpperCase();	
				break;
			}
			case "6":{
				if(regA.equals("0")){
					hi = whole[ct];
					ct++;
					lo = whole[ct];
					ct++;
					loc = Integer.parseInt(hi+lo,16);
				}
				else{
					loc+=3;
				}
				break;
			}
			case "7":{
				hi = whole[ct];
				ct++;
				lo = whole[ct];
				ct++;
				loc = Integer.parseInt(hi+lo,16);
				break;
			}
			case "8":{
				for(int i = 0; i < whole.length; i++){
					System.out.print(whole[i]);
				}
				System.exit(0);
				break;
			}
			}
		}while(true);




	}

}
