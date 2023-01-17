package test.Exeption.Dz.three;

import java.util.Arrays;

public class UserData {
    String[] data;

    public String getUserInfobyIndex(int index) {
        return data[index];
    }
    public String[] getData() {
        return data;
    }
    public void splitString(String info) {
        data = info.split(" ");
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
