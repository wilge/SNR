package snr;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import snr.FileLoader;
import snr.Rosenblatt;

public class main
{
	static ArrayList<ArrayList<String>> dataArray = new ArrayList<>();
	static ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
	
	
	

	public static void main(String[] args) throws FileNotFoundException
	{
		String path = ("D:/MGR/SEM 2/SNR/bank/bank.csv");
		dataArray = FileLoader.loadFile(path);
		System.out.println("Rozmiar arraylisty: " + dataArray.size() + " x " + dataArray.get(0).size());
		
		matrix = Converter.convert(dataArray);
		System.out.println("Rozmiar macierzy: " + matrix.size() + " x " + matrix.get(0).size());
		System.out.println();
		System.out.println(matrix.get(0).toString());
		
		int i = 0;
		
		//arraylist to [] wektor[0-15] - x ; wektor[16] - y 
		int[] wektor = new int[matrix.get(i).size()];
		int count = 0;
			for (Integer n: matrix.get(i))
				wektor[count++] = n.intValue();

		
	}

}
