import java.util.List;

import static java.util.stream.Collectors.toList;

public class ColorMatching {

        /*
         * Complete the 'sockMerchant' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY ar
         */

        public static int sockMerchant(int n, List<Integer> ar) {

            int count = 0;
            List<Integer> arrs = ar.stream().distinct().collect(toList());
            for(int x: arrs)
            {
                count += getPair(ar, x);
            }

            return count;

        }
        private static int getPair(List<Integer>arr, int value)
        {
            List<Integer> dist = arr.stream().filter((x)->x==value).collect(toList());
            return (int)Math.floor(dist.size()/2);
        }

    }



