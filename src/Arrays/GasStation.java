public class Gas_Station {
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        System.out.println(findindex(gas,cost));
    }
    static int findindex(int gas[], int cost[]){
        int totalgas =0;
        int totalcost=0;
        for(int i=0;i<gas.length;i++){
            totalcost+=cost[i];
            totalgas+=gas[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        int currentgas=0;
        int startindex=0;
        for(int i=0;i<gas.length;i++){
            currentgas+=gas[i]-cost[i];
            if(currentgas<0){
                currentgas=0;
                startindex=i+1;
            }
        }
        return startindex;
    }
}
