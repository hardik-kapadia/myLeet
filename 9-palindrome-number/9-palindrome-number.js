/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    
    if (x < 0)
        return false;

    if (Math.floor(x) / 10 === 0)
        return true;

    let num = x.toString();
    let i = -1;
    let l = num.length;

    while (++i < l / 2)
        if (num.charAt(i) !== num.charAt(l - i - 1))
            return false;

    return true;
    
    
};