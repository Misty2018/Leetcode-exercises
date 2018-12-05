
    /*
一个淘宝的订单中包含n(10>=n>=1)种商品A1，A2，...，An，每种商品数量分别为a1，a2，...，an个，记做{a1,a2,...,an}(ak>0)。
. 1point3acres
订单在仓库生产过程中，仓库为了提升作业效率，会提前对热门组合商品进行预包装。
假设这n个商品有m(9>=m>=1)个商品组合，每个组合bomk包含A1，A2，...，An的数量分别为{b1,b2,...,bn}(bk>=0,至少存在一个bk>0)



举例如下：. more info on 1point3acres
. 留学申请论坛-一亩三分地
订单包含A，B，C商品，数量为{2，3，1}，商品组合bom1{2，1，1}，bom2{1，1，0}，bom3{0，1，1}

. 1point 3acres 论坛

对以上订单匹配给定商品组合，得到的可能匹配结果为：res1.匹配到组合1一套，剩余B商品；res2.匹配到组合2两套，组合3一套，不剩商品；

现要求订单的最优匹配，最优匹配的原则为：1.匹配组合后，剩余商品种类数越少越好；2.在剩余商品种类数相同的情况下，匹配到的组合种类数越少越好；
.留学论坛-一亩-三分地
例如上面例子，我们认为res2优于res1。


.1point3acres网
现需要编写程序，输入格式为：

n,m

a1,a2,...,an

bom1,b11,b12,...,b1n

bom2,b21,b22,...,b2n

....

bomm,bm1,bm2,...,bmn


. 1point3acres
输入数据的格式说明（数据间使用英文逗号分隔）：
-google 1point3acres
第一行数据：n个商品，m个预包方案

第二行数据：商品1个数，商品2个数，。。。，商品n个数
. visit 1point3acres for more.
第三行数据：bom1，商品1个数，商品2个数，。。。，商品n个数

第n-1行数据：。。。。

第n行数据：bomn，商品1个数，商品2个数，。。。，商品n个数

. Waral 博客有更多文章,
.本文原创自1point3acres论坛
针对输入数据找出最优匹配，输出最优匹配的组合及套数，比如针对上面的例子输出：

match result:

bom2*2，bom3*1

注：输出结果有多个时可以乱序
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

    public class ShipOrders {
        /** 请完成下面这个函数，实现题目要求的功能 **/
        /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
        private static Map<String, Integer> optimalCombos;
        private static Map<String, Integer> currentCombos;
        private static int minLeftKinds = Integer.MAX_VALUE;

        public static void main(String[] args) {

            List<Integer> order = new ArrayList<Integer>();
            Map<String, List<Integer>> boms = new HashMap<String, List<Integer>>();

            Scanner in = new Scanner(System.in);
            String line = in.nextLine();

            Integer n = Integer.parseInt(line.split(",")[0]);
            Integer m = Integer.parseInt(line.split(",")[1]);

                      line = in.nextLine();
                    String[] itemCnt = line.split(",");
            for(int i = 0; i < n ; i++){
                order.add(Integer.parseInt(itemCnt[i]));
            }

            for(int i = 0; i < m; i++){
                line = in.nextLine();
                String[] bomInput = line.split(",");
                List<Integer> bomDetail = new ArrayList<Integer>();

                for(int j = 1; j <= n; j++ ){
                    bomDetail.add(Integer.parseInt(bomInput[j]));
                }
                boms.put(bomInput[0], bomDetail);
            }
            in.close();

            Map<String, Integer> res = resolve(order, boms);

            System.out.println("match result:");
            for(String key : res.keySet()){
                System.out.println(key+"*"+res.get(key));
            }
        }

        // write your code here.
        public static Map<String, Integer> resolve(List<Integer> order, Map<String, List<Integer>> boms) {
            optimalCombos = new HashMap<>();
            currentCombos = new HashMap<>();
            minLeftKinds = Integer.MAX_VALUE;

            return resolve(order, boms, 1);
        }

        private static Map<String, Integer> resolve(List<Integer> order, Map<String, List<Integer>> boms, int depth) {
            for (int i = 1; i <= boms.size(); i++) {
//            System.out.println("depth = "+ depth);
//            System.out.println("i = " + i);
//            System.out.println("minLeftKinds = " + minLeftKinds);
//            System.out.println("currentCombos:" + currentCombos);
//            System.out.println("optimalCombos:" + optimalCombos);
//            System.out.println("-------------------------------");. visit 1point3acres for more.

                List<Integer> combo = boms.get("bom" + i);
                if (isValidCombo(order, combo)) {
                    deductCombo(order, combo);
                    currentCombos.put("bom" + i, currentCombos.getOrDefault("bom" + i, 0) + 1);

                    resolve(order, boms, depth + 1);

                    addCombo(order, combo);
                    currentCombos.put("bom" + i, currentCombos.get("bom" + i) - 1);
                } else {
                    int leftKinds = kindOfItemsInList(order);
                    if (leftKinds < minLeftKinds) {
                        minLeftKinds = leftKinds;
                        optimalCombos = new HashMap<>(currentCombos);
                    } else if (leftKinds == minLeftKinds) {
                        if (kindOfCombos(currentCombos) < kindOfCombos(optimalCombos)) {
                            optimalCombos = new HashMap<>(currentCombos);
                        }
                    }
                }
            }

            return optimalCombos;
        }

        public static int kindOfItemsInList(List<Integer> list) {
            int count = 0;
            for(int i = 0; i < list.size(); i++) {
                if (list.get(i) > 0) {
                    count++;
                }
            }
            return count;
        }

        public static boolean isValidCombo(List<Integer> items, List<Integer> combo) {
            for (int i = 0; i < combo.size(); i++) {
                if (items.get(i) < combo.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public static void deductCombo(List<Integer> items, List<Integer> combo) {
            for (int i = 0; i < combo.size(); i++) {
                items.set(i, items.get(i) - combo.get(i));
            }
        }

        public static void addCombo(List<Integer> items, List<Integer> combo) {
            for (int i = 0; i < combo.size(); i++) {
                items.set(i, items.get(i) + combo.get(i));
            }
        }

        public static int kindOfCombos(Map<String, Integer> combos) {
            int count = 0;
            for(int i = 1; i <= combos.size(); i++) {
                if (combos.getOrDefault("bom" + i, 0) != 0) {
                    count++;
                }
            }
            return count;
        }
    }

