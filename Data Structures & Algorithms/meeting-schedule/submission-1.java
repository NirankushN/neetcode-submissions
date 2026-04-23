/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // sort the intervals based on start 
        if(intervals==null || intervals.size()<2)
            return true;
        intervals.sort(Comparator.comparingInt(a->a.start));
        Interval prevI = intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            Interval curr= intervals.get(i);
            if(curr.start<prevI.end){
                return false;
            }
            prevI=curr;
        }
        return true;
    }
}
