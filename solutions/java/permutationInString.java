import java.util.Map;
import java.util.HashMap;

public boolean checkInclusion(String s1, String s2) {
	Map<Character, Integer> countOne = new HashMap<>();

	for (char c : s1.toCharArray()) {
		countOne.put(c, countOne.getOrDefault(c, 0) + 1);
	}

	int need = countOne.size();
	for (int i = 0; i < s2.length(); i++) {
		Map<Character, Integer> countTwo = new HashMap<>();
		int curr = 0;
		for (int j = i; j < s2.length(); j++) {
			char c = s2.charAt(j);
			countTwo.put(c, countTwo.getOrDefault(c, 0) + 1);

			if (countOne.getOrDefault(c, 0) < countTwo.get(c)) {
				break;
			}

			if (countOne.getOrDefault(c, 0) == countTwo.get(c)) {
				curr++;
			}

			if (curr == need) {
				return true;
			}
		}
	}
	return false;
}
