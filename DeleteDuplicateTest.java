package tdd.unittesting;

import org.junit.jupiter.api.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeleteDuplicateTest {
	/* TODO list
	 * 1. "ABCD" => "BCD"
	 * 2. "AACD" => "CD"
	 * 3. "BBAA" => "BBAA"
	 * 4. "CADD" => "CDD"
	 * 5. "AABAA" => "BAA"
	 * 6. "" => ""
	 * 7. "A" => ""
	 * 8. "AA" => ""
	 * */
	DeleteDuplicates dd;
	
	@BeforeEach
	void setUp(){
		dd = new DeleteDuplicates();
	}

	@Test
	public void testFistCase() {
		assertEquals("BCD", dd.delete_dup("ABCD"));
	}
	
	@Test
	public void testSecondCase() {
		assertEquals("CD", dd.delete_dup("AACD"));
	}
	
	@Test
	public void testThirdCase() {
		assertEquals("BBAA", dd.delete_dup("BBAA"));
	}
	
	@Test
	public void testFourthCase() {
		assertEquals("CDD", dd.delete_dup("CADD"));
	}
	
	@Test
	public void testFifthCase() {
		assertEquals("BAA", dd.delete_dup("AABAA"));
	}
	
	@Test
	public void testSixthCase() {
		assertEquals("", dd.delete_dup(""));
	}

	@Test
	public void testSeventhCase() {
		assertEquals("", dd.delete_dup("A"));
	}

	@Test
	public void testEigthCase() {
		assertEquals("", dd.delete_dup("AA"));
	}

}







