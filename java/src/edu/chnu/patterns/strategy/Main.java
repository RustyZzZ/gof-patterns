package edu.chnu.patterns.strategy;

public class Main {
	public static void main(String[] args) {
		//oldStrategy();
	}

	private static void newStrategy(){
		var document1 = new Document(DocumentType.ONLY_CODE, null, "code");
		var document2 = new Document(DocumentType.TEXT_AND_CODE, "Text", "code");

		var document = document2;
		var checker = new Checker();
		switch (document.getType()){
			case TEXT_AND_CODE:
				checker.setStrategy((doc)-> System.out.println("Chnu checker. 99%"));
				break;
			case ONLY_CODE:
				checker.setStrategy((doc)-> System.out.println("GH checker. 99%"));
				break;
			case ONLY_TEXT:
				checker.setStrategy((doc)-> System.out.println("Unicheck checker. 99%"));
				break;
		}
		checker.executeCheck(document);


	}

	private static void oldStrategy() {
		var document1 = new Document(DocumentType.ONLY_CODE, null, "code");
		var document2 = new Document(DocumentType.TEXT_AND_CODE, "Text", "code");

		var document = document2;
		var checker = new Checker();
		switch (document.getType()){
			case ONLY_CODE:
				checker.setStrategy(new GHChecker());
				break;
			case ONLY_TEXT:
				checker.setStrategy(new UnicheckChecker());
				break;
			case TEXT_AND_CODE:
				checker.setStrategy(new ChnuChecker());
				break;
		}
		checker.executeCheck(document);
	}
}
