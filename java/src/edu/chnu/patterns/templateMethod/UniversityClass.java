package edu.chnu.patterns.templateMethod;

import lombok.SneakyThrows;

public abstract class UniversityClass {
	protected String subj;

	public UniversityClass(String subj) {
		this.subj = subj;
	}

	@SneakyThrows
	public void startClass() {
		notifyClassStarted();
		classInProgress();
		Thread.sleep(1000);
		setMarks();
		finishClass();
	}

	private void classInProgress() {
		System.out.println("Class is in progress");
	}

	protected abstract void notifyClassStarted();

	protected abstract void setMarks();

	protected abstract void finishClass();
}
