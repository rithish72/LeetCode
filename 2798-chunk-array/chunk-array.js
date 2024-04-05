/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let newArr = [];
    let i = 0
    while(i < arr.length){
        newArr.push(arr.slice(i, i+size));
        i += size;
    }
    return newArr;
};
