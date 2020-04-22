package com.dictionary.word.ugly;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, String> dictionartUglyNice = new HashMap();
        dictionartUglyNice.put("chujowy", "kiepski");
        dictionartUglyNice.put("do bani", "bezużyteczny");
        dictionartUglyNice.put("rozjebany", "zepsuty");
        dictionartUglyNice.put("pojebany", "niemądry");

        Set<String>keySet = dictionartUglyNice.keySet();
        for (String key: keySet) {
            System.out.println("Słowo: " + key + ",   Znaczenie: " + dictionartUglyNice.get(key));
        }

        /**String message = "Oryginalne tłumaczenie";
        System.out.println(message + dictionartUglyNice);

        Set<String> words = dictionartUglyNice.keySet();
        for (String word:words) {
            message = message.replace(word, dictionartUglyNice.get(word));
        }
        System.out.println("Tłumaczenie po korekcie: " + message);

        System.out.println("size is: " + dictionartUglyNice.size());
**/
    }
}
