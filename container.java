/*import java.util.*;

class Container {
    double first;
    double second;
}

public class container {

    public static void main(String[] args){
        //container a = new container();
        double[] weights = {1.98,49.0,51.2,98.0};
        int capacity = 100;
        Container a = container.findOptimalWeights(capacity, weights, 2);
        System.out.println(a.first);
    }

        public static Container findOptimalWeights (int capacity, double[] weights,int numberOfContainer) {
            if (weights == null || weights.length <2) {
                return null;
            }

            Arrays.sort(weights);

            if (weights[0] + weights[1] > capacity) {
                return null;
            }

            Container result = new Container();
            int left = 0;
            int right = weights.length -1;

            while (weights[left] + weights[right] > capacity) {
                right --;
            }

            while (left < right) {

                // find the closest weights[left] + weights[right] to capacity. visit 1point3acres for more.
                while (left < right && weights[left] + weights[right] <= capacity) {
                    left++;
                }
                //move back left
                left--;

                //update result
                if (weights[left] + weights[right] >= result.first + result.second) {
                    result.first = weights[left];
                    result.second = weights[right];
                    if (weights[left] + weights[right] == capacity) {
                        //best solution, no need to continue
                        return result;
                    }
                }
                right--;
            }

            return result;
        }



    }*/


