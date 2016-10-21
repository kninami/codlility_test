function solution(A) {
    let solver = {
        makeCounterHash: (A) => {
            let counterMap = {};
            const ARR_LEN = A.length;
            const HALF_IDX = Math.floor(ARR_LEN / 2);

            for (let idx = 0; idx <= HALF_IDX; idx++) {
                const prenum = A[idx];
                if (counterMap.hasOwnProperty(prenum)) {
                    counterMap[prenum]++;
                } else {
                    counterMap[prenum] = 1;
                }

                if (idx !== HALF_IDX) {
                    const postnum = A[ARR_LEN - idx - 1];
                    if (counterMap.hasOwnProperty(postnum)) {
                        counterMap[postnum]++;
                    } else {
                        counterMap[postnum] = 1;
                    }
                }
            }
            return counterMap;
        },
        getOddNumFromCounterMap: (map) => {
            for (let k in map) {
                if (map[k] % 2 === 1) {
                    return k;
                }
            }
        }
    };

    const counterMap = solver.makeCounterHash(A);
    return Number.parseInt(solver.getOddNumFromCounterMap(counterMap));
}