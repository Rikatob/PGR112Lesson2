package org.pgr112.step2;

import static java.lang.Long.valueOf;

public class Assignment {
    /**
     * Returns the sum of all the received numbers.
     */
    public int addThreeNumbers(int i, int j, int k) {
        return i + j + k;
    }

    /**
     * Evaluates if the received number is
     * Small (less than 100).
     * Big (greater than 1000).
     * Medium (not small or big)
     */
    public String isNumberSmallMediumOrBig(int number){
        if(number<100){
            return("Small");
        } else if(number >1000){
            return("Big");
        } else{
            return ("Medium");
        }

    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     */
    public void printAllStrings(String[] strings){
        for(String i : strings) {
            System.out.println(i);
        }
    }

    /**
     * Returns the sum of all numbers in received array.
     */
    public int arraySum(int[] numbers){
        int result = 0;
        for(int i : numbers){
            result += i;
        }
        return result;
    }

    /**
     * Print all characters until a char is "."
     * Do not print in separate lines.
     */
    public void printFirstSentence(char[] chars) {
        /*for( char i : chars){
            System.out.print(i);
            if(i == '.'){
                break;
            }
        }*/

        String result="";
        boolean stop = false;
        int i=0;
        while (!stop && i<chars.length){
            result += chars[i];
            if(chars[i] == '.'){
                stop = true;
            }
            i++;
        }
            System.out.print(result);
    }

    /**
     * Prints course name for provided course code.
     * PGR103 -> Objektorientert programmering
     * DB1102 -> Database
     * TK2100 -> Informasjonssikkerhet
     * or "Unknown" if none of the above.
     */
    public void printCourseName(String courseCode){
        switch (courseCode) {
            case "PGR103" -> System.out.println("Objektorientert programmering");
            case "DB1102" -> System.out.println("Database");
            case "TK2100" -> System.out.println("Informasjonssikkerhet");
            default -> System.out.println("Unknown");
        }
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not exactly "Corona".
     */
    public void printAllStringsNotCorona(String[] strings){
        for(String i : strings){
            if(i != "Corona"){
                System.out.println(i);
            }
        }

    }

    /**
     * Prints the provided strings in upper case letters.
     * One String on each line.
     */
    public void printUpperCaseStrings(String[] strings){
        for(String i : strings){
            System.out.println(i.toUpperCase());
        }
    }

    /**
     * Returns true if provided color is represented in the Norwegian flag.
     * Color input is lowercase only.
     */
    public boolean isColorInNorwegianFlag(String color){
        return switch (color) {
            case "red", "white", "blue" -> true;
            default -> false;
        };

    }

    /**
     * Returns the index of the first occurrence of char c in String string.
     * Returns -1 if char is not found.
     */
    public int firstOccurrence(String string, char c){
       return string.indexOf(c);
    }

    /**
     * Returns the combined length of the provided Strings.
     */
    public int combinedLength(String s1, String s2){
        return s1.length()+s2.length();
    }

    /**
     * Returns the sum of all the received numbers.
     */
    public int addNumbers(int... numbers){
        int sum=0;
        for(int i : numbers){
            sum += i;
        }
        return sum;
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not Corona (case insensitive).
     */
    public void printAllStringsNotCoronaCaseInsensitive(String[] strings){
        for(String word : strings){
            if(!word.toLowerCase().equals("corona")){
                System.out.println(word);
            }
        }
    }

    /**
     * Egenoppgave
     */
    public int multiplyNumbers(int x, int y ,int z){
        return (x * y * z);
    }

    public double findBitStrength(int signs, int length){
        double bitStrenght = (Math.log10(signs)/Math.log10(2))*length;
        return bitStrenght;
    }
}
