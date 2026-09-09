// Last updated: 09/09/2026, 16:30:39
class NumArray {
    int n;
    int[] BIT;
    int[] nums;
    public NumArray(int[] nums) {
        this.n=nums.length;
        this.BIT=new int[n+1];
        this.nums=nums.clone();

        for(int i=1;i<=n;i++){
            updateBIT(i,nums[i-1]);
        }
    }
    private void updateBIT(int i,int delta){
        while(i<=n){
            BIT[i]+=delta;
            i+= (i & -i);
        }
    }

    private int query(int i){
        int sum=0;
        while(i>0){
            sum+=BIT[i];
            i-=(i & -i);
        }
        return sum;
    }
    public void update(int index, int val) {
        int delta=val-nums[index];
        nums[index]=val;
        updateBIT(index+1,delta);
    }
    
    public int sumRange(int left, int right) {
        return query(right+1)-query(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */