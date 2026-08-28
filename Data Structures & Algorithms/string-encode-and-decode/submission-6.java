class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String str:strs){
            encodedStr += str.length()  + "#" + str;
        }
        return encodedStr;
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j+1, j + 1 + length);

            answerList.add(word);

            i = j + length;
        }

        return answerList;
    }
}
