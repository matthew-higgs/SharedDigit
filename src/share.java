public class share {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 34));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if(first < 10 || first > 99){
            return false;
        }
        if(second < 10 || second > 99){
            return false;
        }

        int secondCopy = second;

        while (first > 0){
            //Get the last digit of first with mod store in firstCheck
            int firstCheck = first % 10;
            while(second > 0){
                //Get the last digit of second with mod store in secCheck
                int secCheck = second % 10;
                if(firstCheck == secCheck){
                    return true;
                }
                second /= 10;
            }
            first /= 10;
            second = secondCopy;
        }

        return false;

    }
}
