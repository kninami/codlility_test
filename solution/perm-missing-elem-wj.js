function solution(A) {
    const sum = (A.length + 1) * (A.length + 1 + 1) / 2;
    return A.reduceRight((prev, cur) => prev - cur, sum);
}