package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		//String expected = "CD";
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("CD"));
	}
	@Test
	public void testTruncateAInFirst2Positions2() {
		StringHelper helper = new StringHelper();
		assertEquals("BCA", helper.truncateAInFirst2Positions("AABCA"));
		assertEquals("BCA", helper.truncateAInFirst2Positions("ABCA"));
		assertEquals("BCA", helper.truncateAInFirst2Positions("BCA"));
		
	}
	@Test
	public void testFirstAndLastPositionAreSame() {
		StringHelper helper = new StringHelper();
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABA"));
	}

}
