/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    List<NestedInteger> nestedList;

    public NestedIterator(List<NestedInteger> nestedList) {

        this.nestedList = nestedList;
    }

    @Override
    public Integer next() {

        NestedInteger temp = this.nestedList.get(0);

        if (temp.isInteger())
            return this.nestedList.remove(0).getInteger();

        NestedIterator ni = new NestedIterator(temp.getList());
        
        if (!ni.hasNext()){
            this.nestedList.remove(0);
            return this.next();
        }

        int i = ni.next();

        if (!ni.hasNext())
            this.nestedList.remove(0);

        return i;
    }

    @Override
    public boolean hasNext() {

        if (this.nestedList.isEmpty())
            return false;

        int i = 0;

        while (i < this.nestedList.size()) {

            if (this.nestedList.get(i).isInteger())
                return true;

            NestedIterator ni = new NestedIterator(this.nestedList.get(i).getList());

            if (ni.hasNext())
                return true;

            i++;
        }

        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */