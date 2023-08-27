<<<<<<< HEAD

// 1773. Count Items Matching a Rule
import java.util.*;

public class Qno1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        switch (ruleKey) {
            case "type":
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(0).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
            case "color":
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(1).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
            case "name":
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(2).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
        }
        return count;
    }
}
=======

// 1773. Count Items Matching a Rule
import java.util.*;

public class Qno1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        switch (ruleKey) {
            case "type":
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(0).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
            case "color":
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(1).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
            case "name":
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(2).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
        }
        return count;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
