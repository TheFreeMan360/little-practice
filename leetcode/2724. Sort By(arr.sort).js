var sortBy = function (arr, fn) {
  return arr.sort((current, next) => {
    if (fn(current) < fn(next)) return -1;
    return 1;
  });
};
