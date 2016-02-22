package home.work.practice;

public class FirstUniqueCharacter {

    public Character find(String s) {
        for (int i=0; i<s.length(); i++){
            int index = 0;
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.charAt(i);
        }
        return null;
    }
}
