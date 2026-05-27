function solution(arr1, arr2) {
  if (arr1.length !== arr2.length) {
    return arr1.length > arr2.length ? 1 : -1;
  } else {
    let arr1Sum = 0;
    let arr2Sum = 0;
    for (arr of arr1) {
      arr1Sum += arr;
    }
    for (arr of arr2) {
      arr2Sum += arr;
    }

    if (arr1Sum > arr2Sum) {
      return 1;
    } else if (arr1Sum < arr2Sum) {
      return -1;
    }
  }
  return 0;
}
