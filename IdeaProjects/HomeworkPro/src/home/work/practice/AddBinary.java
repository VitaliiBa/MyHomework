package home.work.practice;

public class AddBinary {
    public String add(String a, String b) {

        int i = 0;
        int aLenght = a.length();
        int bLenght = b.length();
        StringBuilder result = new StringBuilder();
        int tempMemory = 0;

        while (i < aLenght || i < bLenght) {

            char aTem = (i < aLenght) ? a.charAt(aLenght - 1 - i) : '0';
            char bTem = (i < bLenght) ? b.charAt(bLenght - 1 - i) : '0';

            int sum = (aTem - '0') + (bTem - '0') + tempMemory;

            if (sum == 0) {
                result.append('0');
                tempMemory = 0;
            } else if (sum == 1) {
                result.append('1');
                tempMemory = 0;
            } else if (sum == 2) {
                result.append('0');
                tempMemory = 1;
            } else if (sum == 3) {
                result.append('1');
                tempMemory = 1;
            }

            i++;
        }
        if (tempMemory == 1) result.append('1');

        result.reverse();

        return result.toString();

    }

}
