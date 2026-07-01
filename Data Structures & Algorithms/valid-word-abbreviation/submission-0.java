class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;

        while (i < word.length() && j < abbr.length()) {

            char a = abbr.charAt(j);
            char w = word.charAt(i);

            if (Character.isDigit(a)) {

                if (a == '0') {
                    return false;
                }

                int curr = 0;

                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    curr = curr * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i += curr;

            } else {

                if (w != a) {
                    return false;
                }

                i++;
                j++;
            }
        }

        return i == word.length() && j == abbr.length();
    }
}