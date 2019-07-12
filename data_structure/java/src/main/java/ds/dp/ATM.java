package ds.dp;

import static java.util.stream.Collectors.toMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ATM {

  private Map<Integer, Integer> moneyInfoMap = new HashMap<>();

  public ATM() {
    moneyInfoMap.put(1, 20);
    moneyInfoMap.put(5, 8);
    moneyInfoMap.put(10, 11);
    moneyInfoMap.put(50, 10);
    moneyInfoMap.put(100, 5);
  }

  public int getMoneyCnt(int money, int moneyNote, int cnt) {
    while(money < moneyNote * cnt) {
      cnt--;
    }
    return cnt;
  }

  public Map<Integer, Integer> widthdraw(int money, int idx, Map<Integer, Integer> moneyMap) {

    List<Integer> nominalMoneyList = moneyInfoMap.keySet().stream().sorted().collect(Collectors.toList());

    int nm = nominalMoneyList.get(idx);
    int cm = moneyInfoMap.get(nm);
    int moneyCnt = getMoneyCnt(money, nm, cm);
    int newMoney = money - nm * moneyCnt;

    if (idx > 0) {
      moneyMap.put(nm, moneyCnt);
      this.widthdraw(newMoney, idx - 1, moneyMap);
    }
    return moneyMap;
  }

  public Map<Integer, Integer> getMoneyInfoMap() {
    return moneyInfoMap;
  }
}
