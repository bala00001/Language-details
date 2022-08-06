package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("South India language is Tamil,malayalam,kannadam,telugu");
	}
     public void northIndia() {
		System.out.println("North India Language is Hindi, Bengali, marathi");

	}

      public static void main(String[] args) {
		LanguageInfo LLL = new LanguageInfo();
		LLL.englishLanguage();
		LLL.hindiLanguage();
		LLL.tamilLanguage();
		
		StateDetails sss = new StateDetails();
		sss.northIndia();
		sss.southIndia();
				
	}

}
