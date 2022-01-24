/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function (word) {

    let firstCapital = false;
    let anyOtherCapital = false;
    let allOtherCapital = true;

    letters = [...word];

    var isUpperCase = c => c === c.toUpperCase();

    firstCapital = isUpperCase(letters[0]) ? true : false;

    for (let i = 1; i < letters.length; i++) {

        let c = letters[i];

        if (isUpperCase(c))
            anyOtherCapital = true;
        else
            allOtherCapital = false;

        if (!firstCapital && anyOtherCapital)
            return false;

        if (anyOtherCapital && !allOtherCapital)
            return false;

    }

    return true;

};