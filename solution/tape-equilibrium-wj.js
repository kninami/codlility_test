function solution(A) {
    if(A.length === 1) return A[0];
    if(A.lenght === 2) return Math.abs(A[0], A[1]);

    let totalSum = 0;
    A.forEach((v) => totalSum += v);

    let minDist = Number.MAX_VALUE;
    let leftSum = 0;
    for(let idx = 0; idx < A.length - 1; idx++) {
        leftSum += A[idx];
        const rightSum = totalSum - leftSum;
        const dist = Math.abs(leftSum - rightSum);

        minDist = Math.min(minDist, dist);
    }
   return minDist;
}