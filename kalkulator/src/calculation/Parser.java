package calculation;

import java.util.ArrayList;

public class Parser {

	private ArrayList<Sign> arrStack;
	private String strSufix;
	private String strONP;
	private ArrayList<String> arrSufix;



	public Parser(String strSufix) {
		super();
		arrStack = new ArrayList<>();
		arrSufix = new ArrayList<>();
		this.strSufix = strSufix;
		separateSufix();
		printArraySufix();
	}



	public ArrayList<Sign> getArrStack() {
		return arrStack;
	}



	public void setArrStack(ArrayList<Sign> arrStack) {
		this.arrStack = arrStack;
	}



	public String getStrSufix() {
		return strSufix;
	}



	public void setStrSufix(String strSufix) {
		this.strSufix = strSufix;
	}



	public String getStrONP() {
		return strONP;
	}



	public void setStrONP(String strONP) {
		this.strONP = strONP;
	}

	private void separateSufix(){
		int iLength;
		iLength = strSufix.length();
		String temp = "";
		char tabCharSuffix[] = new char[iLength];
		tabCharSuffix = strSufix.toCharArray();
		for(int i=0; i<iLength; i++){
			if(i<iLength && !((int)tabCharSuffix[i]>47  && (int)tabCharSuffix[i]<59  || tabCharSuffix[i]==',')){
				temp += tabCharSuffix[i];
			}
			else{
				while(i<iLength && ((int)tabCharSuffix[i]>47  && (int)tabCharSuffix[i]<59  || tabCharSuffix[i]==',')){
					temp += tabCharSuffix[i];
					i++;
				}
				i--;
			}
			arrSufix.add(temp);
			temp = "";
		}


	}

	public void printArraySufix(){
		for(String object: this.arrSufix)
			System.out.println(object);
	}



	public void sufixToONP(){


	}

}
