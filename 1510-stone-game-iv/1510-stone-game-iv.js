/**
 * @param {number} n
 * @return {boolean}
 */
var winnerSquareGame = function(n) {
    let dp = new Map();
    dp.set(1, true);

    /**
     * @param {number} n
     * @return {boolean}
     */
    function helper(n) {


        if (dp.has(n))
            return dp.get(n);

        if (Number.isInteger(Math.sqrt(n))) {
            dp.set(n, true);
            return true;
        }

        let removed = Math.floor(Math.sqrt(n))

        // console.log("considering for n: " + n);

        let canWin;

        while (removed >= 1) {

            canWin = !helper(n - Math.pow(removed, 2));

            if (canWin) {
                dp.set(n, true);
                return true;
            }

            removed--;

        }

        dp.set(n, false);
        return false;


    }

    return helper(n);
};