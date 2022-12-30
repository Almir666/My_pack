package test.Exeption.Dz.three;

public class NumberException {
    public void checkNumber(String number) throws NumberFormatException {
        Integer.parseInt(number);
    }
}
