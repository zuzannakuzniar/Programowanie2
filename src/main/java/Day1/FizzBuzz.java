package Day1;

public class FizzBuzz {

    private int value;

    public FizzBuzz(int value) {
        this.value = value;
    }

    private String checkValue() {
        String result = ""+this.value;

        if (value % 3 == 0) result = "Fizz";
        if(value%5==0) result= "Buzz";
        if(value%15==0) result= "FizzBuzz";
        if(value==0) result = "0";

        return result;
    }

    private boolean checkIfContains_v1(String searchingValue,int value) {

        return false;

    }


        @Override
        public String toString() {
            return checkValue();
        }
    }