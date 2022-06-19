class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();

        List<String> prev = new ArrayList<>(Arrays.stream(products).toList());
        List<String> temp = new ArrayList<>();

        char[] cs = searchWord.toCharArray();

        for (int i = 0; i < cs.length; i++) {

            temp.clear();
            
            for (String s : prev)
                if (s.length() > i)
                    if (s.charAt(i) == cs[i])
                        temp.add(s);

            Collections.sort(temp);
            
            ans.add(new ArrayList<>(temp.size() > 3 ? temp.subList(0, 3) : temp));

            prev = new ArrayList<>(temp);

        }

        return ans;
    }
}