package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("test");
            InputStream inputStream = new FileInputStream("test");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            User first = new User();
            first.setFirstName("Dmitry");
            first.setLastName("Zolotarev");
            first.setBirthDate(new Date(89, Calendar.APRIL, 14));
            first.setMale(true);
            first.setCountry(User.Country.RUSSIA);
            javaRush.users.add(first);

            User second = new User();
            second.setFirstName("Anastasiia");
            second.setLastName("Zolotareva");
            second.setBirthDate(new Date(86, Calendar.MARCH, 15));
            second.setMale(false);
            second.setCountry(User.Country.RUSSIA);
            javaRush.users.add(second);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (User u: users) {
                bw.write(u.getFirstName() + "\n");
                bw.write(u.getLastName() + "\n");
                bw.write("" + u.getBirthDate().getTime() + "\n");
                bw.write("" + u.isMale() + "\n");
                bw.write("" + u.getCountry() + "\n");
            }
            bw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            while (br.ready()) {
                User user = new User();
                user.setFirstName(br.readLine());
                user.setLastName(br.readLine());
                user.setBirthDate(new Date(Long.parseLong(br.readLine())));
                user.setMale(br.readLine().equals("true"));
                String country = br.readLine();
                if (country.equals("RUSSIA")) user.setCountry(User.Country.RUSSIA);
                else if (country.equals("UKRAINE")) user.setCountry(User.Country.UKRAINE);
                else user.setCountry(User.Country.OTHER);
                if(user.getFirstName() != null) this.users.add(user);
            }
            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
