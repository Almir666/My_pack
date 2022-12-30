package test.Exeption.Dz.three;

public class Gender {
    char[] gender;

    public void checkMale(String genderUser) throws GenderException {
        gender = new char[]{'f', 'm', 'м', 'ж'};

        char smt2 = genderUser.charAt(0);

        if (smt2 != gender[0] && smt2 != gender[1] && smt2 != gender[2] && smt2 != gender[3]) {
            throw new GenderException();
        }
    }
}
