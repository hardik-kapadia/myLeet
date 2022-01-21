/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    let l = gas.length;
    let total_surplus = 0;
    let surplus = 0;
    let start = 0;

    for (let i = 0; i < l; i++) {

        total_surplus += gas[i] - cost[i];
        surplus += gas[i] - cost[i];

        if (surplus < 0) {
            surplus = 0;
            start = i + 1;
        }
    }

    return total_surplus < 0 ? -1 : start;
};