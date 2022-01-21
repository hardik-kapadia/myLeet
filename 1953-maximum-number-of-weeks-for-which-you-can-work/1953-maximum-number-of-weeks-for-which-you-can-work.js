/**
 * @param {number[]} milestones
 * @return {number}
 */
var numberOfWeeks = function(milestones) {
     let most = Math.max(...milestones);
    let sum = milestones.reduce((sum, a) => { return sum + a }, 0);
    let other = sum - most;

    if (other >= most)
        return sum;
    else
        return 2 * other + 1;
};