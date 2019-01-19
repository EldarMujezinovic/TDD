package ba.bildit.code;

public class Stringovi {
	
	public int duzinaStringa(String str){
		return str.length();
	}
	
	public String parnePozicije(String str){
		String str1 = "";
		for(int i = 0; i < str.length(); i++){
			if(i % 2 == 0){
				str1 += str.charAt(i);
			}
		}
		return str1;
	}
	
	public String neparnePozicije(String str){
		String str1 = "";
		for(int i = 0; i < str.length(); i++){
			if(i % 2 != 0){
				str1 += str.charAt(i);
			}
		}
		return str1;
	}
	
	public int upperCase(String str){
		int broj = 0;
		for(int i = 0; i < str.length(); i++){
			if(Character.isUpperCase(str.charAt(i))){
				broj++;
			}
		}
		return broj;
	}
	public int lowerCase(String str){
		int broj = 0;
		for(int i = 0; i < str.length(); i++){
			if(Character.isLowerCase(str.charAt(i))){
				broj++;
			}
		}
		return broj;
	}
	public String ostaliKarakteri(String str){
		String str1 = "";
		for(int i = 0; i < str.length(); i++){
			if(Character.isLetter(str.charAt(i))){
				continue;
			}else{
				str1 += str.charAt(i);
			}
		}
		return str1;
		
	}
	
	
}
