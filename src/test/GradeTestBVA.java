package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTestBVA {
	LetterGrade lettergrade = new LetterGrade();
	@Test
	public void gradeTestA() {
		assertEquals('A', lettergrade.letterGrade(100));
		assertEquals('A', lettergrade.letterGrade(90));
	}
	@Test
	public void gradeTestB() {
		assertEquals('B', lettergrade.letterGrade(89));
		assertEquals('B', lettergrade.letterGrade(80));
	}
	@Test
	public void gradeTestC() {
		assertEquals('C', lettergrade.letterGrade(79));
		assertEquals('C', lettergrade.letterGrade(70));
	}
	@Test
	public void gradeTestD() {
		assertEquals('D', lettergrade.letterGrade(69));
		assertEquals('D', lettergrade.letterGrade(60));
	}
	@Test
	public void gradeTestF() {
		assertEquals('F', lettergrade.letterGrade(59));
		assertEquals('F', lettergrade.letterGrade(0));
	}
	@Test
	public void gradeTestX() {
		assertEquals('X', lettergrade.letterGrade(101));
		assertEquals('X', lettergrade.letterGrade(-1));
	}
	
}
