class Solution {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // 0 - course
        // 1 - preRequisite

        // TODO: Complete it

        Map<Integer, Set<Integer>> map = new HashMap<>();
        Map<Integer, Boolean> can = new HashMap<>();

        for (int[] is : prerequisites) {
            if (!map.containsKey(is[0]))
                map.put(is[0], new HashSet<>());

            map.get(is[0]).add(is[1]);
        }

        for (int i = 0; i < numCourses; i++)
            if (!canComplete(map, can, i, new HashSet<>()))
                return false;

        return true;

    }

    private boolean canComplete(Map<Integer, Set<Integer>> map, Map<Integer, Boolean> can, int course,
            Set<Integer> cannot) {

        if (can.containsKey(course))
            return can.get(course);

        if (!map.containsKey(course)) {
            can.put(course, true);
            return true;
        }

        Set<Integer> preqs = map.get(course);

        for (Integer integer : preqs)
            if (cannot.contains(integer)){
                can.put(course,false);
                return false;
            }

        cannot.add(course);

        for (Integer integer : preqs)
            if (!canComplete(map, can, integer, cannot)) {
                can.put(course, false);
                return false;
            }

        cannot.remove(course);
        can.put(course, true);
        return true;
    }
}