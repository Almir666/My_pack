package test.Exeption.Dz.three;

public class WrongUserDataSize {
    public boolean countSize(String[] userInfo) {
        if (userInfo.length < 6) {
            return true;
        }
        return false;
    }
}
