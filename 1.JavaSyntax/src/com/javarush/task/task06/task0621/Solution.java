package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName, null, null);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentM;
        private Cat parentF;

        Cat(String name, Cat parentM, Cat parentF) {
            this.name = name;
            this.parentM = parentM;
            this.parentF = parentF;
        }

        @Override
        public String toString() {
            if (parentF == null && parentM == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (parentF == null && parentM != null)
                return "The cat's name is " + name + ", mother is " + parentM.name + ", no father";
            else if (parentF != null && parentM == null)
                return "The cat's name is " + name + ", no mother, father is " + parentF.name;
            else
                return "The cat's name is " + name + ", mother is " + parentM.name + ", father is " + parentF.name;
        }
    }

}