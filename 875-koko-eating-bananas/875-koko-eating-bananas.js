/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    totalBanans = piles.reduce((partial_sum, a) => partial_sum + a, 0)

    let minSpeed = Math.ceil(totalBanans / h);
    let maxSpeed = Math.max(...piles);

    let bestRes = maxSpeed;

    const getTime = speed => {
        let res = 0;

        for (const p of piles) {
            res += Math.ceil(p / speed);
        }

        return res;

    }

    while (minSpeed <= maxSpeed) {

        let mid = Math.floor((minSpeed + maxSpeed) / 2);

        const tookTime = getTime(mid);

        if (tookTime <= h) {
            bestRes = mid;
            maxSpeed = mid - 1;
        } else
            minSpeed = mid + 1;

    }

    return bestRes;

};