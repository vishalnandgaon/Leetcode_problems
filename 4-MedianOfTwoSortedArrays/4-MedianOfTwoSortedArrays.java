// Last updated: 14/08/2025, 11:35:41
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int c1=l1+l2;
        int[] nums3=new int[c1];
        for(int i=0;i<l1;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<l2;i++){
            nums3[l1+i]=nums2[i];
        }
        Arrays.sort(nums3);
        if(c1%2==0){
            double c=nums3[(c1/2)-1] + nums3[(c1/2)];
            double e=c/2;
            return e;
        }
        else{
            double d=nums3[((c1+1)/2)-1];
            return d;
        }
        
    }
}