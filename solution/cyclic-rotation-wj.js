function solution(A, K) {
    if (A.length === K || A.length === 0) return A;

    const newArr = [];

    for (let idx = 0; idx < A.length; idx++) {
        newArr[(K+idx) % A.length] = A[idx];
    }
    return newArr;
}