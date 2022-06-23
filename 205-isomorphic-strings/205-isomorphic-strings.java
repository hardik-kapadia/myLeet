class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> swap = new HashMap<>();
        Set<Character> assigned = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            
            if(swap.containsKey(cS)){
                if(swap.get(cS) != cT)
                    return false;
            }
            
            if(assigned.contains(cT))
                if(!swap.containsKey(cS) || swap.get(cS) != cT)
                    return false;
            
            swap.put(cS,cT);
            assigned.add(cT);
            
        }
        
        return true;
        
        
        
    }
}