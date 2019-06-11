package ueb01;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {


	@Test
	void testPalindrom() {

		String[] xs = {
				"a",
				"aa",
				"Ana",
				"Anna",
				"Regallager",
				"Ein Neger mit Gazelle zagt im Regen nie",
				"Eine g\u00fcldne gute Tugend L\u00fcge nie"
		};


		for (String s : xs) {
			System.err.println(s);
//			System.out.println(Palindrom.istPalindrom(s));
			assertTrue(Palindrom.istPalindrom(s));
		}

		String[] zs = {
				"hansdampf",
				"peter pan",
				"quatsch mit sosse",
				"ab"
		};

		for (String s : zs) {
			System.err.println(s);
//			System.out.println(Palindrom.istPalindrom(s));
			assertFalse(Palindrom.istPalindrom(s));
		}


	}
}