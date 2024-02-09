/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function (arr, size) {
    const res = new Array();
    for (let i = 0; i < arr.length; i++){
        const addInx = Math.floor(i / size);
        if(res.length - 1 < addInx)
            res.push(new Array());
        res[addInx].push(arr[i]);
    }
    return res;
};

// var chunk = function (arr, size) {
//     const res = new Array();
//     for (let i = 0; i < arr.length; i += size) {
//         res.push(arr.slice(i, i + size));
//     }
//     return res
// };