package ds.dp;

public class LCS {

    public static int LCS(String a, String b, int aLen, int bLen) {

        if (aLen == 0 || bLen == 0)
            return 0;
        else {
            int aLenIdx = aLen - 1;
            int bLenIdx = bLen - 1;
            if (a.charAt(aLenIdx) == b.charAt(bLenIdx)) {
                return 1 + LCS(a, b, aLenIdx, bLenIdx);
            } else {
                return Math.max(LCS(a, b, aLenIdx, bLen), LCS(a, b, aLen, bLenIdx));
            }

        }
    }

}
