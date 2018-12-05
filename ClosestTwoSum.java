import java.util.Arrays;

class Container {
    public double first;
    public double second;
}

public class ClosestTwoSum {


    public static void main(String[] args){
        //container a = new container();
        double[] weights = {1.98,49.0,51.2,98.0};
        double capacity = 100;
        Container a = ClosestTwoSum.findOptimalWeights(capacity, weights, 2);
        System.out.println(a.first);
        System.out.println(a.second);
    }

    public static Container findOptimalWeights(double capacity, double[] weights, int numOfContainers) {
        Container result = new Container();
        if (weights == null || weights.length < 2) return result;

        double min = 0.0;
        int minPos = 0;
        int maxPos = weights.length - 1;
        int i = 0, j = weights.length - 1;

        //int lo = 0, hi = weights.length - 1, first = lo, second = hi;


        Arrays.sort(weights);

        while (i < j) {
            double sum = weights[i] + weights[j];

            if (sum > min && sum <= capacity) {
                min = sum;
                minPos = i;
                maxPos = j;
            }

            if (sum > capacity) {
                j--;
            } else {
                i++;
            }
        }

        result.first = weights[minPos];
        result.second = weights[maxPos];

        return result;
    }

       /* System.out.println("The two numbers for which sum is closest to target are "
                + weights[minPos] + " and " + weights[maxPos]);*/
    }



      /* while (lo < hi) {
            if (weights[lo] + weights[hi] == target) {
                first = lo;
                second = hi;
                break;
            } else if (weights[lo] + weights[hi] > target) {
                hi --;
            }else {
                if (target < weights[first] + weights[second] || target - (weights[first] + weights[second]) > target - (weights[lo] + weights[hi])) {
                    first = lo;
                    second = hi;
                }
                lo ++;
            }

            }
        result.first = weights[first];
        result.second = weights[second];
        return result;
        }
}*/
