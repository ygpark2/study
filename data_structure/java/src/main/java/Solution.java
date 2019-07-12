import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

  // Complete the makeAnagram function below.
  static int makeAnagram(String a, String b) {
    List<Character> aCharsList = a.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    List<Character> bCharsList = b.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    List<Character> biggerList = new ArrayList<>();
    List<Character> smallerList = new ArrayList<>();
    if (aCharsList.size() > bCharsList.size()) {
      biggerList = aCharsList;
    } else {
      smallerList = bCharsList;
    }
    List<Character> clonedList = new ArrayList<>();
    biggerList.forEach(t -> clonedList.add(t));
    for(Character item : clonedList) {
      System.out.println(item);
       if (smallerList.contains(item)) {
         System.out.println("contain both => " + item);
         bCharsList.remove(item);
         aCharsList.remove(item);
       }
    }

    System.out.println(aCharsList);
    System.out.println(bCharsList);

    aCharsList.addAll(bCharsList);
    return aCharsList.size();

  }

  /*
   * Complete the runningMedian function below.
   */
  static double[] runningMedian(int[] a) {
    double[] medianArray = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      int pos = i + 1;
      int[] subArray = Arrays.copyOfRange(a, 0, pos);
      Arrays.sort(subArray);
      int mid = pos % 2;
      if (mid == 0) {
          int posIdx = pos / 2;
          double sum = subArray[posIdx-1] + subArray[posIdx];
          medianArray[i] = Math.round(sum / 2 * 10.0) / 10.0;
      } else {
        if (i == 0) {
          medianArray[i] = a[i];
        } else {
          int posIdx = pos / 2;
          medianArray[i] = subArray[posIdx];
        }
      }
      System.out.println(medianArray[i]);
    }
    return medianArray;
  }

  /*
  static String[] lcs(String a, String b, int aLen, int bLen) {


  }
  */

  // Complete the isBalanced function below.
  static String isBalanced(String s) {
    Map<String, String> bracketMap = new HashMap<>();
    bracketMap.put("(", ")");
    bracketMap.put("{", "}");
    bracketMap.put("[", "]");
    Stack<String> stack = new Stack<>();
    char[] chs = s.toCharArray();
    for (int fidx = 0; fidx < chs.length; fidx++) {
      String bracket = String.valueOf(chs[fidx]);
      if (!stack.empty() && bracketMap.keySet().contains(stack.peek()) && bracketMap.get(stack.peek()).equals(bracket)) {
        stack.pop();
      } else {
        stack.push(bracket);
      }
    }

    if (stack.empty())
      return "YES";
    else
      return "NO";
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
/*
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

3
{[()]}
{[(])}
{{[[(())]]}}

{(([])[])[]}
{(([])[])[]]}
{(([])[])[]}[]
*/
    System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    System.out.println(makeAnagram("abc","cde"));


    /*
      37632.0
23875.0
25334.0
31483.0
37632.0
61125.0
84618.0
85978.5
84618.0
85978.5
84618.0
85978.5
84618.0
65440.0
65147.0
55704.5
49990.0
53674.5
49990.0
53674.5

12.0
8.0
5.0
4.5
5.0
6.0
     */
    int[] param = {37632,
        10118,
        25334,
        84618,
        87339,
        97852,
        91683,
        99232,
        31552,
        90453,
        46239,
        89445,
        23303,
        46262,
        65147,
        15646,
        49990,
        57359,
        18685};

        // {1,2,3,4,5,6,7,8,9,10};
    System.out.println(runningMedian(param));
    // String s = "{[()]}";
    String s = "{(([])[])[]]}";
    // String s = "{{[[(())]]}}";
    String result = isBalanced(s);
    System.out.println(result);

  }
}
