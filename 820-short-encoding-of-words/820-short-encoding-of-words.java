class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        
        List<String> wordsL = Arrays.stream(words).sorted((p, q) -> q.length() - p.length()).toList();

        StringBuilder sb = new StringBuilder();

        sb.append(wordsL.get(0));
        sb.append("#");

        Set<Integer> indices = new HashSet<>();
        indices.add(0);

        Set<Integer> hashes = new HashSet<>();
        hashes.add(sb.length() - 1);

        for (int i = 1; i < wordsL.size(); i++) {

            char[] word = wordsL.get(i).toCharArray();

            boolean fit = false;

            int hashI = -1;

            for (int hash : hashes) {

                for (int j = word.length - 1, k = 0; j >= 0; j--, k++) {

                    if (word[j] != sb.charAt(hash - k - 1))
                        break;

                    if (j == 0) {
                        fit = true;
                        hashI = hash;
                        break;
                    }

                }

                if (fit) {
                    indices.add(hashI - word.length);
                    break;
                }

            }

            if (!fit) {
                indices.add(sb.length());
                sb.append(new String(word)).append("#");
                hashes.add(sb.length() - 1);

            }

        }

        // System.out.println("Encoded: " + sb.toString());
        // System.out.println("Indices: " + indices);

        return sb.length();
        
    }
}