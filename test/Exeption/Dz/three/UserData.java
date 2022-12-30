package test.Exeption.Dz.three;

import java.util.Arrays;

public class UserData {
    String[] Data;

    public String getUserInfobyIndex(int index) {
        return Data[index];
    }
    public String[] getData() {
        return Data;
    }
    public void splitString(String info) {
        Data = info.split(" ");
    }

    @Override
    public String toString() {
        return Arrays.toString(Data);
    }
}
