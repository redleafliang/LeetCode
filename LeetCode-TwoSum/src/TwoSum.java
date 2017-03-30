import java.util.HashMap;
import java.util.Map;

/**
 * Created by hongyeliang on 2017/3/8.
 */
public class TwoSum {

    public static int [] TwoSum( int[] nums, int target)

    {
        int twosum[] = new int [2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                twosum[0]=i+1;
                twosum[1]=map.get(target-nums[i]);
                return twosum;

            }

            map.put(nums[i], i+1);

        }

        return twosum;

    }

    public static void main (String str[])
    {
        int nums[] ={2,7,11,15};
        int target = 9;
        int result[] = new int [2];
        result = TwoSum(nums,target);
        System.out.print(result[0]);
        System.out.println("  ");
        System.out.print(result[1]);


    }


}
