// Last updated: 09/09/2026, 16:16:40
class Fancy {

    List<Long> list;
    long mul = 1;
    long add = 0;
    long mod = 1000000007;

    public Fancy() {
        list = new ArrayList<>();
    }

    public void append(int val) {
        long normalized = (val - add + mod) % mod;
        normalized = (normalized * modInverse(mul)) % mod;
        list.add(normalized);
    }

    public void addAll(int inc) {
        add = (add + inc) % mod;
    }

    public void multAll(int m) {
        mul = (mul * m) % mod;
        add = (add * m) % mod;
    }

    public int getIndex(int idx) {
        if(idx >= list.size()) return -1;
        return (int)((list.get(idx) * mul % mod + add) % mod);
    }

    private long modInverse(long x) {
        return pow(x, mod - 2);
    }

    private long pow(long x, long y) {
        long res = 1;
        x %= mod;

        while(y > 0){
            if((y & 1) == 1)
                res = (res * x) % mod;

            x = (x * x) % mod;
            y >>= 1;
        }

        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */