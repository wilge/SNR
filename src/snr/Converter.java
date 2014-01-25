package snr;

import java.util.ArrayList;


public class Converter
{
	public static ArrayList<ArrayList<Integer>> convert (ArrayList<ArrayList<String>> data)
	{
		ArrayList<ArrayList<Integer>> tab = new ArrayList<>();
		
		//1 wiersz to nag³ówki
		for (int i=1; i<data.size(); i++)
		{
			ArrayList<Integer> temp = new ArrayList<>();
			int[] pom = new int[17];
			int j=0;
			//1 - age (numeric)
			try
			{
				temp.add(Integer.parseInt(data.get(i).get(j)));
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
			}
			//2 - job : type of job (categorical: 'admin.','unknown','unemployed','management','housemaid','entrepreneur','student',
			//'blue-collar','self-employed','retired','technician','services') 
			j++;
			switch (data.get(i).get(j)) {
			case "admin.": pom[j]=1;
				break;
			case "unknown": pom[j]=2;
				break;
			case "unemployed": pom[j]=3;
				break;
			case "management": pom[j]=4;
				break;
			case "housemaid": pom[j]=5;
				break;
			case "entrepreneur": pom[j]=6;
				break;		
			case "student": pom[j]=7;
				break;	
			case "blue-collar": pom[j]=8;
				break;	
			case "self-employed": pom[j]=9;
				break;	
			case "retired": pom[j]=10;
				break;	
			case "technician": pom[j]=11;
				break;	
			case "services": pom[j]=12;
				break;	
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
			//	3 - marital : marital status (categorical: 'married','divorced','single'; note: 'divorced' means divorced or widowed)
			j++;
			switch (data.get(i).get(j)) {
			case "married": pom[j] = 1;
				break;
			case "divorced": pom[j] = 2;
				break;
			case "single": pom[j] = 3;
				break;
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
			//	4 - education (categorical: 'unknown','secondary','primary','tertiary')
			j++;
			switch (data.get(i).get(j)) {
			case "unknown": pom[j] = 1;
				break;
			case "secondary": pom[j] = 2;
				break;
			case "primary": pom[j] = 3;
				break;
			case "tertiary": pom[j] = 4;
				break;					
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
//			5 - default: has credit in default? (binary: 'yes','yes')
			j++;
			switch (data.get(i).get(j)) {
			case "yes": pom[j] = 1;
				break;
			case "no": pom[j] = 2;
				break;			
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
//			6 - balance: average yearly balance, in euros (numeric)
			j++;
			try
			{
				temp.add(Integer.parseInt(data.get(i).get(j)));
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
			}
//			7 - housing: has housing loan? (binary: 'yes','no')
			j++;
			switch (data.get(i).get(j)) {
			case "yes": pom[j] = 1;
				break;
			case "no": pom[j] = 2;
				break;			
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
//			8 - loan: has personal loan? (binary: 'yes','no')
			j++;
			switch (data.get(i).get(j)) {
			case "yes": pom[j] = 1; break;
			case "no": pom[j] = 2; break;			
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
//			# related with the last contact of the current campaign:
//			9 - contact: contact communication type (categorical: 'unknown','telephone','cellular')
			j++;
			switch (data.get(i).get(j)) {
			case "unknown": pom[j] = 1;	break;
			case "telephone": pom[j] = 2; break;		
			case "cellular": pom[j] = 3; break;		
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
//			10 - day: last contact day of the month (numeric)
			j++;
			try
			{
				temp.add(Integer.parseInt(data.get(i).get(j)));
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
			}
//			11 - month: last contact month of year (categorical: 'jan', 'feb', 'mar', ..., 'nov', 'dec')
			j++;
			switch (data.get(i).get(j)) {
			case "jan": pom[j] = 1; break;
			case "feb": pom[j] = 2; break;
			case "mar": pom[j] = 3; break;
			case "apr": pom[j] = 4; break;
			case "may": pom[j] = 5; break;
			case "jun": pom[j] = 6; break;
			case "jul": pom[j] = 7; break;
			case "aug": pom[j] = 8; break;
			case "sep": pom[j] = 9; break;
			case "oct": pom[j] = 10; break;
			case "nov": pom[j] = 11; break;
			case "dec": pom[j] = 12; break;	 
			default: pom[j] = 0;
			}
			temp.add(pom[j]);			
//			12 - duration: last contact duration, in seconds (numeric)
			j++;
			try
			{
				temp.add(Integer.parseInt(data.get(i).get(j)));
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
			}
//			# other attributes:
//			13 - campaign: number of contacts performed during this campaign and for this client (numeric, includes last contact)
			j++;
			try
			{
				temp.add(Integer.parseInt(data.get(i).get(j)));
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
			}
//			14 - pdays: number of days that passed by after the client was last contacted from a previous campaign (numeric, -1 means client was not previously contacted)
			j++;
			try
			{
				temp.add(Integer.parseInt(data.get(i).get(j)));
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
			}
//			15 - previous: number of contacts performed before this campaign and for this client (numeric)
			j++;
			try
			{
				temp.add(Integer.parseInt(data.get(i).get(j)));
			} catch (NumberFormatException e)
			{
				e.printStackTrace();
			}
//			16 - poutcome: outcome of the previous marketing campaign (categorical: 'unknown','other','failure','success')
			j++;
			switch (data.get(i).get(j)) {
			case "unknown": pom[j] = 1;	break;
			case "other": pom[j] = 2; break;		
			case "failure": pom[j] = 3; break;		
			case "success": pom[j] = 4; break;		
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
			//  Output variable (desired target):
			//  17 - y - has the client subscribed a term deposit? (binary: "yes","no")
			j++;
			switch (data.get(i).get(j)) {
			case "yes": pom[j] = 1; break;
			case "no": pom[j] = -1; break;			
			default: pom[j] = 0;
			}
			temp.add(pom[j]);
						
			
			tab.add(temp);
		}
		
		return tab;
	}
	
}
