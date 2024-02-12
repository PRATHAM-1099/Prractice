package DSA.Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trie {
    Trie[] children = new Trie[26];
    boolean flag;


    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> mp = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] str = cpdomain.split(" ");
            int num = Integer.parseInt(str[1]);
            if(mp.containsKey(str[1])){
                int cnt = mp.get(str[1]);
                cnt+=num;
                mp.put(str[1], cnt);
            }
            for(int j=0;j<str[1].length();j++){
                if(str[1].charAt(j)=='.'){
                    str[1] = str[1].substring(j+1);
                    if(mp.containsKey(str[1])){
                        int cnt = mp.get(str[1]);
                        cnt+=num;
                        mp.put(str[1], cnt);
                    }
                    mp.put(str[1], Integer.parseInt(str[1]));
                }
            }
        }
        List<String> ans = new ArrayList<>();
        mp.forEach((k,v)  -> {
            String a = v.toString() + k;
        });
        return ans;
    }

}
