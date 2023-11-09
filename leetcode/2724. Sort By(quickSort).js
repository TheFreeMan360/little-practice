var sortBy = function (arr, fn) {
  quickSort(arr, 0, arr.length - 1, fn);
  return arr;
};

// 可以把 fn 想成取位置的方法
function quickSort(arr, l, r, fn) {
  if (l >= r) return;

  let pviot = l,
    i = l;
  for (let j = l + 1; j <= r; ++j) {
    if (fn(arr[j]) < fn(arr[pviot])) {
      ++i;
      swap(arr, i, j);
    }
  }

  swap(arr, l, i);
  quickSort(arr, l, i - 1, fn);
  quickSort(arr, i + 1, r, fn);
}

function swap(arr, i, j) {
  let tmp = arr[i];
  arr[i] = arr[j];
  arr[j] = tmp;
}
