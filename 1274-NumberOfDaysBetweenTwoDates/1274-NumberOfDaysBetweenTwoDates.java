// Last updated: 29/08/2025, 22:06:28
class Solution {
    public boolean isLeapYear(int year){
            return year%400==0 || (year%4==0 && year%100!=0);
            }
    public int fdate(String dates){
            int days=0;
            int year=Integer.parseInt(dates.substring(0,4));
            int month=Integer.parseInt(dates.substring(5,7));
            int day=Integer.parseInt(dates.substring(8,10));

            for(int i=1900;i<year;i++){
                days+=isLeapYear(i) ? 366:365;
            }
            int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
            for(int i=1;i<month;i++){
                days+=months[i-1];
            }
            if(isLeapYear(year) && month>2){
                days++;
            }
            days+=day;
            return days;
        }    
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(fdate(date1)-fdate(date2));
    }
}