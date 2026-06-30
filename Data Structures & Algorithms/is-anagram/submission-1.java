class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] str1 = s.toCharArray();
        Arrays.sort(str1);

        char[] str2 = t.toCharArray();
        Arrays.sort(str2);

        for(int i=0; i<s.length(); i++)
        {
            if(str1[i] == str2[i])
            {

            }
            else {
                return false;
            }
        }

        return true;
        // if (Arrays.equals(str1,str2)) {
        //     return true;
        // }
        // return false;
    }
}