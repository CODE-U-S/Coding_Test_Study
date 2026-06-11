function solution(myString) {
  myString = myString.toLowerCase();

  while (myString.indexOf("a") !== -1) {
    myString = myString.replace("a", "A");
  }
  return myString;
}
