/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    
    if(x < 0)
        return false;
    
    if(Math.floor(x/10) === 0)
        return true;

    let y = x;
    let z = 0;

    while(y > 0){
        
        let r = y % 10;
        z = (z*10) + r;
        y = Math.floor(y/ 10);

    }
    

    return x === z;
    
    
};