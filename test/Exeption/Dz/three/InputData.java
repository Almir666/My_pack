package test.Exeption.Dz.three;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class InputData {
    UserData userdata;
    Scanner in;
    WrongUserDataSize wrongSize;
    DateException dateEx;
    Gender gen;
    NumberException num;
    SaveFileData save;

    InputData() {
        userdata = new UserData();
        wrongSize = new WrongUserDataSize();
        dateEx = new DateException();
        gen = new Gender();
        num = new NumberException();
        save = new SaveFileData();
    }

    public void App() {
        while (true) {
            System.out.println("Введите строку в формате: \n" +
                    "\"Фамилия Имя Отчество дата рождения номер телефона пол \": ");
            in = new Scanner(System.in);
            userdata.splitString(in.nextLine());

            if (wrongSize.countSize(userdata.getData())) {
                System.out.println("Вы ввели не верное колличество данных");
            } else {
                try {
                    dateEx.checkDate(userdata.getUserInfobyIndex(3));
                    num.checkNumber(userdata.getUserInfobyIndex(4));
                    gen.checkMale(userdata.getUserInfobyIndex(5));
                    save.SaveData(userdata);
                    return;
                } catch (ParseException e) {
                    System.out.println("Введите корректную дату");
                } catch (NumberFormatException e) {
                    System.out.println("Введите номер без знаков");
                } catch (GenderException e) {
                    System.out.println("Вы не верно выбрали пол");
                }catch (IOException ex) {
                    System.out.println("Ошибка! Не могу записать в файл " + ex.getStackTrace());
                }
            }
        }
    }
}
