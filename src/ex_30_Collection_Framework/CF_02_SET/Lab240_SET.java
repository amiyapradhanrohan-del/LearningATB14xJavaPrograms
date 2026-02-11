package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_SET {
    public static void main(String[] args) {
        //No duplicates are allowed in case of "SET"
        Set hs = new HashSet(); //HashSet follows Hashing mechanism
        // da67sd7alkjht6hdjnd9kmn978
        hs.add("Pramod"); //da67sd7alkjht6hdjnd9kmn978
        hs.add("Pramod"); //da67sd7alkjht6hdjnd9kmn978
        hs.add("dramod"); //qqqqweerrrrr7789iiklmm990
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();
    }
}
