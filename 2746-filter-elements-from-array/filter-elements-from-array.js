/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let newArray = []
    for(let i=0;i<arr.length;i++){
        if (fn(arr[i], i, arr)) {
            newArray.push(arr[i]);
        }
    }
    return newArray;

};