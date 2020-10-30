package edu.chnu.patterns.decorator;

public class UniCheckDecorator extends PlagiarismCheckerDecorator{
	public UniCheckDecorator(PlagiarismChecking checker) {
		super(checker);
	}

	@Override
	public void checkForPlagiarism(String file) {
		this.checker.checkForPlagiarism(file);
		var result = 10;
		if (this.checker instanceof PlagiarismCheckerDecorator){
			this.result = (int) (((PlagiarismCheckerDecorator) this.checker).result*0.3 + result*0.7);
		}else{
			this.result =result;
		}
		System.out.println("Check on Uni check");
	}
	// check only documentation
}
