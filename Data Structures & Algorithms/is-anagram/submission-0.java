class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp1=new HashMap<>();
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp1.containsKey(s.charAt(i))){
                mp1.put(s.charAt(i),mp1.get(s.charAt(i)+1));
            }
            else{
                mp1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(mp2.containsKey(t.charAt(i))){
                mp2.put(t.charAt(i),mp2.get(t.charAt(i)+1));
            }
            else{
                mp2.put(t.charAt(i),1);
            }
        }
         return mp1.equals(mp2);

    }
}
