// Last updated: 13/03/2026, 22:52:52
/*
    Problem Statement:
    -----------------
    We are given a positive integer n.
    We must concatenate the binary representations of all integers
    from 1 to n (inclusive), in order.

    Example:
        n = 3
        Binary forms:
            1  -> 1
            2  -> 10
            3  -> 11
        Concatenated result:
            "11011"
        Output (decimal):
            27

    Since this number grows extremely large,
    we return the result modulo 1_000_000_007.


    Initial Thoughts (Brute Force):
    -------------------------------
    - Convert each number i to binary using Integer.toBinaryString(i).
    - Append them into a StringBuilder.
    - Convert final string to a number.
    - Take modulo.

    Problem:
    --------
    - The final binary length is roughly:
            1 + 2 + 2 + 3 + 3 + 3 + ... ≈ O(n log n)
    - The resulting number becomes astronomically large.
    - We cannot store such large binary strings.
    - Conversion to integer would overflow even long.

    So brute force string building is NOT feasible.


    Key Observations:
    -----------------
    1. Binary concatenation is equivalent to shifting left
        by the number of bits in the appended number.

    Suppose current result = res
    and we want to append integer i.

    If i has k bits,
    then:
            newRes = res * 2^k + i

    In binary,
            res << k  is exactly  res * 2^k

    So we can simulate concatenation mathematically,
    without ever building strings.


    2. How do we compute number of bits of i efficiently?

        One way:
            k = Integer.toBinaryString(i).length()

        But that costs extra overhead.

        Better observation:
            Binary length increases ONLY when i becomes power of 2.

        Example:
            1  -> 1 bit
            2  -> 2 bits
            3  -> 2 bits
            4  -> 3 bits
            8  -> 4 bits

        Therefore:
            If i is power of 2 → bit length increases.

        Power of 2 detection trick:
            (i & (i - 1)) == 0

        Why?
            Power of 2 has exactly one set bit.
            Subtracting 1 flips lower bits.
            AND becomes zero.


    Final Optimized Approach:
    -------------------------
    - Maintain:
            res  → current concatenated value
            len  → current binary length

    - For i from 1 to n:
            If i is power of 2 → len++
            res = (res << len) + i
            res %= mod

    This simulates binary concatenation directly.


    Complexity Analysis:
    --------------------
    Time Complexity:
        - Single loop from 1 to n
        - Each iteration constant work
        → O(n)

    Space Complexity:
        - Only two variables (res, len)
        → O(1)

    This is optimal.


    Why modulo each time?
    ----------------------
    - Without modulo, res grows beyond long range.
    - Modulo ensures value remains bounded.
    - Since:
            (a * b + c) % m
        =   ((a % m) * (b % m) + c % m) % m
        It is mathematically valid to take mod at each step.
*/

class Solution {

    int mod = 1_000_000_007 ;

    //Map<Integer, Integer> cache = new HashMap<>() ;

    public int concatenatedBinary(int n) {

        long res = 0 ;

        int len = 0 ;
        
        for(int i = 1 ; i <= n ; i ++)
        {
            if((i & (i-1)) == 0 ) len ++ ;

            res = ((res << len) +i ) % mod;
        }

        return (int)res;

        // cache.put(1, 1) ;

        // if(cache.containsKey(n)) return cache.get(n) ;

        // for(int i = 2 ; i <= n ; i++)
        // {
        //     if(!cache.containsKey(i))
        //     {
        //         int prev = cache.get(i-1) ;
        //         int len = Integer.toBinaryString(i).length() ;

        //         long curr = ((long)prev << len) + i ;
        //         curr %= mod ;

        //         cache.put(i, (int)curr) ;
        //     }
        // }

        // return cache.get(n); 
    }
}