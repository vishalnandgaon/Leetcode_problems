// Last updated: 09/09/2026, 16:03:42
class Solution {
    public String convertDateToBinary(String date) {
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        String yearr=Integer.toString(year,2);
        String monthh=Integer.toString(month,2);
        String dayy=Integer.toString(day,2);

        return yearr +"-"+monthh+"-"+dayy;

    }
}