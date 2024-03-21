public class Task6 {
    public static void main(String[] args) {
        String originalString = "DEMOCRACY";
        String reversedString = reverseString(originalString);
        String extractedWord = extractWord(reversedString,"COME");

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
        System.out.println("Extracted word: " + extractedWord);
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String extractWord(String str, String targetWord) {
        int index = str.indexOf(targetWord);
        if (index != -1) {
            return str.substring(index, index + targetWord.length());
        } else {
            return "Word not found";
        }
    }
}