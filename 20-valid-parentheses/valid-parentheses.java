class Solution {
    public boolean isValid(String s) {
        // boolean check = true;
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);

        }
        System.out.println(list);

        for (int i = 0; i <= s.length(); ++i) { // need to go till =list.size() coz list size is shrinking
            // if(!check)
            // break;
            for (int j = 0; j < list.size() - 1; j++) {

                if (list.get(j) == '(' || list.get(j) == '{' || list.get(j) == '[') {

                    if (list.get(j) == '(' && list.get(j + 1) == ')' || list.get(j) == '{' && list.get(j + 1) == '}'
                            || list.get(j) == '[' && list.get(j + 1) == ']') {

                        list.remove(j + 1);
                        list.remove(j);
                        break;
                    }
                    // else{
                    //     return false;
                    // }

                }
            }
        }
        if(list.isEmpty()){
            return true;

        }else{
            return false;
        }

    }
}