/**
 * @param {number[]} arr
 * @return {boolean}
 */
var validMountainArray = function(arr) {
    
    if (arr.length < 3)
        return false;

    let i;

    for (i = 0; i < arr.length; i++)
        if (arr[i] >= arr[i + 1])
            break;
    
    if(i == 0 || i == arr.length)
        return false;

    for (; i < arr.length; i++)
        if (arr[i] <= arr[i + 1])
            return false;

    return true;
};