/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();


    for (let index = 0; index < nums.length; index++) {
        
        const complement = target - nums[index];

        if(map.has(complement) && map.get(complement) !== index)
            return [map.get(complement),index];

        map.set(nums[index],index);
        
    }

    return null;
};