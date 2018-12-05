import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestJobFirst {
    public float Solution(int[] req, int[] dur) {
        if (req == null || dur == null || req.length != dur.length)
            return 0;
        int index = 0, length = req.length;
        int waitTime = 0, curTime = 0;
        PriorityQueue<process> pq = new PriorityQueue<process>(new Comparator<process>() {
            @Override
            public int compare(process p1, process p2) {
                if (p1.exeTime == p2.exeTime)
                    return p1.arrTime - p2.arrTime;
                return p1.exeTime - p2.exeTime;
            }
        });
        while (!pq.isEmpty() || index < length) {
            if (!pq.isEmpty()) {
                process cur = pq.poll();
                waitTime += curTime - cur.arrTime;
                curTime += cur.exeTime;
                while (index < length && curTime >= req[index])
                    pq.offer(new process(req[index], dur[index++]));
            }
            else {
                pq.offer(new process(req[index], dur[index]));
                curTime = req[index++];
            }
        }
        return (float) waitTime / length;
    }
}



/*
public static float SJFaverage(int[] request, int[] duration){
	            if (request == null || duration == null || request.length == 0 || duration.length == 0){
	                return 0;
	            }
	            int curEnd = 0;
	            int n = request.length;
	            boolean[] processed = new boolean[request.length];
	            int minDuration = Integer.MAX_VALUE;
	            int total = 0;
	           // Arrays.fill(processed, false);
	            int index = 0;
	            while (n > 0){
	                for (int i = 0; i < request.length; i++){
	                    if (request[i] <= curEnd && processed[i] == false && duration[i] < minDuration){
	                        minDuration = duration[i];
	                        index = i;
	                    }
	                }
	                processed[index] = true;
	                total += curEnd - request[index];
	                curEnd += duration[index];
	                n--;
	                minDuration = Integer.MAX_VALUE;
	            }

	            return (float)total / request.length;
	        }


 */
