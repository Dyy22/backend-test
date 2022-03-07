public class Main {
    public static void main(String[] args) {
        System.out.println(binerToDecimal(1001011110010010L));
        System.out.println(decimalToBiner(19));
    }

    static Integer decimalToBiner(int num){
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            if (num % 2 == 0) {
                result.append(0);
                num /= 2;
            } else {
                result.append(1);
                num = (num - 1) / 2;
            }
        }
        return Integer.parseInt(result.reverse().toString());
    }

    static Integer binerToDecimal(long num){

        String numString = String.valueOf(num);

        String[] numArr = numString.split("");
        int result = 0;

        int j = 0;
        for (int i = numArr.length - 1; i >= 0; i--){
            if (Integer.parseInt(numArr[i]) == 1) result += Math.round(Math.pow(2, j));
            j++;
        }

        return result;
    }
}
