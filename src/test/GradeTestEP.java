package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTestEP {
	LetterGrade lettergrade = new LetterGrade();
	@Test
	public void gradeTestA() {
		assertEquals('A', lettergrade.letterGrade(92));
	}
	@Test
	public void gradeTestB() {
		assertEquals('B', lettergrade.letterGrade(85));
	}
	@Test
	public void gradeTestC() {
		assertEquals('C', lettergrade.letterGrade(73));
	}
	@Test
	public void gradeTestD() {
		assertEquals('D', lettergrade.letterGrade(61));
	}
	@Test
	public void gradeTestF() {
		assertEquals('F', lettergrade.letterGrade(59));
	}
	@Test
	public void gradeTestX() {
		assertEquals('X', lettergrade.letterGrade(123));
		assertEquals('X', lettergrade.letterGrade(-87));
	}
}
