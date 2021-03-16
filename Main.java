import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		String input = new String();
		String ouput = new String();
		while(line != null){
			if(line.equals(""))
				input += "b";
			else
				input += line + "\n";
			line = br.readLine();
		}//End while
		String[] cases = input.split("b");
		for(int j = 0; j < cases.length; j++){
			String[] inputLines = cases[j].split("\\\n");
			String[] arr = inputLines[1].split(" ");
			int[] booksPrice = convertInput(arr, Integer.parseInt(inputLines[0]));
			int peterMoney = Integer.parseInt(inputLines[2]);
			Arrays.sort(booksPrice);
			int[] prices = new int[2];
			for(int i = 0; i < booksPrice.length; i++){
				if(i==0){
					prices = findBooks(booksPrice,booksPrice[i],i,peterMoney);
				}
				else{
					int[] aux = findBooks(booksPrice,booksPrice[i],i,peterMoney);
					if(aux != null && prices != null){
						if(aux[1]-aux[0] < prices[1] - prices[0] && (aux[1]-aux[0]) >= 0){
							prices = aux;
						}
					}else{
						prices = (prices != null)?prices:aux;
					}
				}//End else
			}//End for
			ouput += "Peter should buy books whose prices are "+prices[0]+" and "+prices[1]+".\n\n";
		}
		bw.write(ouput);
		br.close();
		bw.close();
	}//End main
	
	public static int[] convertInput(final String[] sBooksPrice,final int size){
		int[] booksPrice = new int[size];
		for(int i = 0; i < size; i++){
			booksPrice[i] = Integer.parseInt(sBooksPrice[i]);
		}//End for
		return booksPrice;
	}//End convertInput
	
	public static int[] findBooks(final int[] booksPrice,final int value,final int indice, final int money){
		boolean found = false;
		int start = 0;
		int end = booksPrice.length - 1;
		int[] values = new int[2];
		while(start <= end && !found){
			int medio = (start+end)/2;
			if(booksPrice[medio] + value == money && medio != indice){//
				values[0] = value;
				values[1] = booksPrice[medio];
				found = true;
			}else if(booksPrice[medio] + value > money){
				end = medio - 1;
			}else{
				start = medio + 1;
			}//End if...else
		}//End while
		if(values[0] == 0 && values[0] == 0)
			values = null;
			
		return values;
	}//End findBooks
}//End seguimiento6 