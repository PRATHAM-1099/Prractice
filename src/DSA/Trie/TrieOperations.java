package DSA.Trie;


import java.util.List;

class Trie {
    private final Trie[] children = new Trie[26];
    private boolean flag;
    int ew;
    int cp;

    boolean containsKey(char ch){
        return children[ch - 'a'] != null;
    }

    void addKey(char ch, Trie trie){
        children[ch-'a'] = trie;
    }

    Trie getNext(char ch){
        return children[ch-'a'];
    }

    void setFlag(){
        flag=true;
    }
    boolean getFlag(){
       return flag;
    }
}
public class TrieOperations{
     static Trie root;

    public TrieOperations(){
        root = new Trie();
    }

    public void insert(String key){
        Trie temp = root;
        for(int i=0;i<key.length();i++){
            if(!temp.containsKey(key.charAt(i))){
                temp.addKey(key.charAt(i),new Trie());
            }
            temp = temp.getNext(key.charAt(i));
            temp.cp++;
        }
        temp.ew++;
        temp.setFlag();
    }

    public boolean searchWord(String word){
        Trie temp = root;
        for(int i=0;i<word.length();i++){
            if(!temp.containsKey(word.charAt(i))){
                return false;
            }
            temp = temp.getNext(word.charAt(i));
        }
        return temp.getFlag();
    }

    public boolean searchPrefix(String prefix){
        Trie temp = root;
        for(int i=0;i<prefix.length();i++){
            if(!temp.containsKey(prefix.charAt(i))){
                return false;
            }
            temp = temp.getNext(prefix.charAt(i));
        }
        return true;
    }

    public int startsWith(String prefix){
        Trie temp = root;
        for(int i=0;i<prefix.length();i++){
            if(!temp.containsKey(prefix.charAt(i))){
                return 0;
            }
            temp = temp.getNext(prefix.charAt(i));
        }
        return temp.cp;
    }

    public int countWords(String prefix){
        Trie temp = root;
        for(int i=0;i<prefix.length();i++){
            if(!temp.containsKey(prefix.charAt(i))){
                return 0;
            }
            temp = temp.getNext(prefix.charAt(i));
        }
        if(temp.getFlag()){
            return temp.ew;
        }
        else return 0;
    }

    public String completeString(List<String> list) {
        String ans = "";
        for (String s : list) {
            Trie node = root;
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                if (node.containsKey(s.charAt(j))) {
                    node=node.getNext(s.charAt(j));
                    if (!node.getFlag()) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (ans.length() < s.length()) {
                    ans = s;
                } else if (ans.length() == s.length()) {
                    if (ans.compareTo(s) > 0) {
                        ans = s;
                    }
                }
            }
        }
        return ans;
    }
}
