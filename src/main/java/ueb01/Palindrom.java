package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		CharStackImpl cs = new CharStackImpl();

		Boolean pal = true;

		s = s.toLowerCase();
		s = s.replaceAll(" ", "");
		char [] charArray = s.toCharArray();


		if (charArray.length == 1){
			return pal;
		} else {
			for (char c: charArray) {
				cs.push(c);
			}

			int j = cs.size() - 1;
			for (int i = 0; i <= cs.size()/2; i++){
				if(charArray[i] != charArray[j]){
					pal = false;
				} else {
					j--;
				}
			}
		}
		return pal;
	}
}
