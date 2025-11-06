class Solution {
    public boolean isValid(String s) {

        // Approach-1
        // List<Character> list = new ArrayList<>();
        // for (char c : s.toCharArray()) {
        //     list.add(c);

        // }

        // for (int i = 0; i <= s.length(); ++i) {
        //     for (int j = 0; j < list.size() - 1; j++) {

        //         if (list.get(j) == '(' || list.get(j) == '{' || list.get(j) == '[') {

        //             if (list.get(j) == '(' && list.get(j + 1) == ')' || list.get(j) == '{' && list.get(j + 1) == '}'
        //                     || list.get(j) == '[' && list.get(j + 1) == ']') {

        //                 list.remove(j + 1); // removing j+1 first cause of indexOutOfBound
        //                 list.remove(j);
        //                 break;
        //             }
                    

        //         }
        //     }
        // }
        // if(list.isEmpty()){
        //     return true;

        // }else{
        //     return false;
        // }


        // Approach-2
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i <= s.length(); ++i) {

            for (int j = 0; j < sb.length() - 1; j++) {

                if (sb.charAt(j) == '(' || sb.charAt(j) == '{' || sb.charAt(j) == '[') {

                    if (sb.charAt(j) == '(' && sb.charAt(j + 1) == ')' || sb.charAt(j) == '{' && sb.charAt(j+1) == '}'
                            || sb.charAt(j) == '[' && sb.charAt(j+1) == ']') {


                        sb.deleteCharAt(j + 1);
                        sb.deleteCharAt(j);
                        break;
                    }

                }
            }
        }

        return sb.isEmpty();
            

    }

}
