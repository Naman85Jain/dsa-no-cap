// return the longest common prefix among an array of strings
public class CommonPrefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        String prefix = str[0]; // start with the first string as the prefix
        for(int i = 1; i < str.length; i++) {
            while(str[i].indexOf(prefix) != 0) { // check if the prefix is not at the start
                prefix = prefix.substring(0, prefix.length() - 1); // reduce the prefix length
                if(prefix.isEmpty()) { // if prefix becomes empty, return empty string
                    System.out.println("Longest common prefix: " + prefix);
                    return;
                }
            }
        }
    }
}
