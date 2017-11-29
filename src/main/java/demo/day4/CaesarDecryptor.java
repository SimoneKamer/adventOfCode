package demo.day4;

public class CaesarDecryptor {

    public static String decryptString (String letterCode, int sectorID) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letterCode.length(); i++) {
            sb.append(cipher(letterCode.charAt(i), sectorID));
        }
        return sb.toString();
    }

    public static char cipher(char c, int sectorID) {
        final int alphaLength = 26;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';
        final int cipherShift = sectorID % alphaLength;
        char shifted = (char) (c - asciiShift);
        shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);
        return (char) (shifted + asciiShift);
    }



}
