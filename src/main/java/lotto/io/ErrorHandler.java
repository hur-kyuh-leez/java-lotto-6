package lotto.io;

public class ErrorHandler {
    public static void checkInt(String boughtAmount){
        if (!boughtAmount.matches("-?\\d+")) {
            throw new IllegalArgumentException("Error! 입력값은 Integer 여야 합니다");
        }
    }
    public static void checkPositive(String boughtAmount){
        int boughtAmountInt = Integer.parseInt(boughtAmount);
        if (boughtAmountInt < 0) {
            throw new IllegalArgumentException("Error! 입력값은 양수 여야 합니다.");
        }
    }
    public static void checkThousands(String boughtAmount){
        int boughtAmountInt = Integer.parseInt(boughtAmount);
        if (boughtAmountInt % 1000 != 0) {
            throw new IllegalArgumentException("Error! 1000 단위로 입력해야 합니다.");
        }
    }

}
