/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {number[]}
 */
var getAllElements = function(root1, root2) {
    /**
     * 
     * @param {TreeNode} base 
     * @returns {number[]} elements
     */
    var getListOfElements = (base) => {

        if (base == null)
            return [];

        let elements = [];

        elements.push(...getListOfElements(base.left));
        elements.push(base.val);
        elements.push(...getListOfElements(base.right));

        return elements;

    }

    let l1 = getListOfElements(root1);
    let l2 = getListOfElements(root2);
    
    // console.log('l1: '+l1);
    // console.log('l2: '+l2);

    let l = [];


    while (l1.length > 0 && l2.length > 0) {

        if (l1[0] < l2[0])
            l.push(l1.shift());
        else
            l.push(l2.shift());
    }

    if (l1.length > 0)
        l.push(...l1);
    else
        l.push(...l2);

    return l;
};