public class WaterBottles
{
    public int numWaterBottles(int numBottles, int numExchange) {
        int numEmpty = 0 ;
        int totalDrunk = 0;
        if(numBottles < numExchange)
            return numBottles;
        else{
           while(numBottles > 0)
            {
                //After drinking
                numBottles--;
                totalDrunk++;
                numEmpty++;
                if(numEmpty == numExchange )
                {
                    numBottles++;
                    numEmpty = 0;
                }
            }
        }
    return totalDrunk;}
}
