class Solution {
     class TrieNode {
    Map<Character, TrieNode> map;  // use TrieNode[] array with -'a'
    List<String> words;

    public TrieNode() {
      map = new HashMap<>();
      words = new ArrayList<>();

    }
  }

  TrieNode root = new TrieNode();

  public void insert(String word) {
    TrieNode curr = root;
    for (int i = 0; i < word.length(); i++) {
      if (curr.map.get(word.charAt(i)) == null) {
        curr.map.put(word.charAt(i), new TrieNode());
      }
      curr = curr.map.get(word.charAt(i));
      curr.words.add(word);

    }

  }

  public List<List<String>> suggestedProducts(String[] products, String searchword) {
    Arrays.sort(products);
    for (String str : products) {
      insert(str);
    }
    List<List<String>> result = new ArrayList<>();
    TrieNode curr = root;
    for (int i = 0; i < searchword.length(); i++) {

      if (curr == null)
        result.add(new ArrayList<>());
      else if (curr.map.get(searchword.charAt(i)) == null) {

        result.add(new ArrayList<>());
        curr = null;
      } else {
        curr = curr.map.get(searchword.charAt(i));
        List<String> adds = new ArrayList<>();
        for (int j = 0; j < curr.words.size(); j++) {
          if (j == 3)
            break;
          adds.add(curr.words.get(j));
        }
        result.add(adds);
      }
    }
    return result;
  }
}