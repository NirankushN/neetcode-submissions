class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int k=0,l=people.length-1;
        int count=0;
        while(k<=l){
            if((people[k]+people[l])<=limit){
                count+=1;
                k++;
                l--;
                continue;
            }
            if(people[l]<=limit){
                count++;
                l--;
                continue;
            }
            if(people[k]<=limit){
                count++;
                k++;
                continue;
            }
        }
        System.out.println("k = " + k + " l = " +l);
        return count;
    }
}