/*
node로 실행
풀이 방식
시간 복잡도를 O(n)으로 하기 위해 bit연산으로 하여 처리
10진수 값을 1과 AND 연산해서 2진수의 역순으로 하나씩 꺼내서 처리
*/
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


rl.question('input value: ', (inputVal) => {
  rl.close();

  let curNum = inputVal;

  let maxZeroCnt = 0;
  let curZeroCnt = 0;
  let isValid = false;
  while(true) {
    const curBinNum = curNum & 1;
    const isVaildZeroSection = isValid && curBinNum === 0;
    const isValidBoundary = curBinNum === 1;

    if ( isVaildZeroSection ) {
      curZeroCnt++;
    }

    if ( isValidBoundary ) {
      isValid = true;
      if (maxZeroCnt < curZeroCnt) {
        maxZeroCnt = curZeroCnt;
      }
      curZeroCnt = 0;
    }
    curNum = curNum >> 1;
    if (curNum === 0) {
      break;
    }
  }
  console.log(`max zero cnt: ${maxZeroCnt}`);
});
