package demo.day5;


import org.apache.commons.codec.digest.DigestUtils;

import java.util.*;

public class FindPassword {


    public static void main(String[] args) {
        String doorID = "cxdnnyjw";
        String pass = createPassword(doorID);
        System.out.println(pass);

    }

    protected static String createPassword(String doorID) {
        int index = 0;
        SortedMap<Integer,Character> password = new TreeMap<>();

        while (password.size() < 8) {
            String codeToHash = doorID + index;
            String hashedCode = DigestUtils.md5Hex(codeToHash);
            if (hashedCode.startsWith("00000")) {
                try {
                    Integer positionToFill = Integer.valueOf(hashedCode.substring(5,6));
                    if (positionToFill <8){
                        if (!password.containsKey(positionToFill)) {
                            password.put(positionToFill, hashedCode.charAt(6));
                        }
                    }
                } catch (NumberFormatException e) {
//                    expected situation, do nothing.
                }
            }
            index++;
        }
        Collection<Character> values = password.values();
        StringBuilder passwordBuilder = new StringBuilder();
        for (Character value : values) {
            passwordBuilder.append(value);
        }
        return passwordBuilder.toString();
    }
}
