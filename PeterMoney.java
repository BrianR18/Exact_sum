import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.io.IOException;

public class PeterMoney{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		String input = new String();
		while(line != null){
			input += line + "\n"; 
			line = br.readLine();
		}//End while
		String[] inputLines = input.split("\\\n");
		String[] arr = inputLines[1].split(" ");
		int[] booksPrice = convertInput(arr, Integer.parseInt(inputLines[0]));
		int peterMoney = Integer.parseInt(inputLines[2]);
		insertionSort(booksPrice,Integer.parseInt(inputLines[0]));
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
	
	public static String findBooks(final int[] booksPrice,final int value,final int indice, final int money){
		boolean found = false;
		int start = 0;
		int end = booksPrice.length - 1;
		while(inicio <= fin && !found){
			int medio = (start+end)/2;
			if(){
				
			}else if(){
				
			}else{
				
			}//End if...else
		}//End while
	}//End findBooks
	
	public static void insertionSort(int[] booksPrice, final int size){
		for(int i = 1; i < size; i++ ){
			for(int j = i; j > 0; j--){
				if(booksPrice[j] < booksPrice[j-1]){
					int aux = booksPrice[j];
					booksPrice[j] = booksPrice[j-1];
					booksPrice[j-1] = aux;
				}//End if
			}//End for
		}//End for
	}//End insertionSort
}//End seguimiento6