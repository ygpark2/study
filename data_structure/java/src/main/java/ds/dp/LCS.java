package ds.dp;

public class LCS {

  public LCS() {

  }

  public int lcs(String a, String b, int aLen, int bLen) {
    if (aLen == 0 || bLen == 0)
      return 0;

    char[] aCharArray = a.toCharArray();
    char[] bCharArray = b.toCharArray();
    if (aCharArray[aLen - 1] == bCharArray[bLen - 1]) {
      return 1 + lcs(a, b, aLen - 1 , bLen - 1);
    } else {
      return Math.max(lcs(a, b, aLen - 1, bLen), lcs(a, b, aLen, bLen - 1));
    }
  }
}
