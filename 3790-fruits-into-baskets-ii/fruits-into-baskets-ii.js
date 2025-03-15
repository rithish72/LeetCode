/**
 * @param {number[]} fruits
 * @param {number[]} baskets
 * @return {number}
 */
var numOfUnplacedFruits = function(fruits, baskets) {
    let unplaced = 0;
    let n = fruits.length;
    let m = baskets.length;

    for(let i=0;i<n;i++){
        let placed = false;
        for(let j=0;j<m;j++){
            if(baskets[j] >= fruits[i]){
                baskets[j] = -1;
                placed = true;
                break;
            }
        }
        if(!placed){
            unplaced++;
        }
    }
    return unplaced;
};