// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
// Each letter in magazine can only be used once in ransomNote.

public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < magazine.length(); i++) {
          Character key = magazine.charAt(i);
          if (map.containsKey(key)) {
              map.put(key, map.get(key) + 1);
          } else {
              map.put(key, 1);
          }
      }
      for (int i = 0; i < ransomNote.length(); i++) {
          Character c = ransomNote.charAt(i);
          if (!map.containsKey(c)) {
              return false;
          }
          map.put(c, map.get(c) - 1);
      }
      for (Integer val : map.values()) {
          if (val < 0) {
              return false;
          }
      }
      return true;
  }
