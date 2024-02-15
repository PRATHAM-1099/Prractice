package DSA.Trie;


class Trie {
    private Trie[] children = new Trie[26];
    private boolean flag;

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
        }
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
}
