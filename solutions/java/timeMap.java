import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class TimeMap {
	private Map<String, List<Pair<Integer, String>>> keyStore;

	public TimeMap() {
		keyStore = new HashMap<>();
	}

	public void set(String key, String value, int timestamp) {
		keyStore.computeIfAbsent(key, _ -> new ArrayList<>()).add(new Pair<>(timestamp, value));
	}

	public String get(String key, int timestamp) {
		List<Pair<Integer, String>> values = keyStore.getOrDefault(key, new ArrayList<>());
		int left = 0, right = values.size() - 1;
		String res = "";

		while (left <= right) {
			int middle = left + ((right - left) / 2);

			if (values.get(middle).getKey() <= timestamp) {
				res = values.get(middle).getValue();
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}

		return res;
	}

	private static class Pair<K, V> {
		private final K key;
		private final V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
	}
}
