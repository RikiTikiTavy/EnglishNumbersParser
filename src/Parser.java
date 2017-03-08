/**
 * Created by Roman on 08.03.2017.
 */
public class Parser {



    public int switcher(String splitedString){
            int stringNumber = 0;

        switch (splitedString){
            case "one": stringNumber = 1; break;
            case "a": stringNumber = 1; break;
            case "two": stringNumber = 2; break;
            case "three": stringNumber = 3; break;
            case "four": stringNumber = 4; break;
            case "five": stringNumber = 5; break;
            case "six": stringNumber = 6; break;
            case "seven": stringNumber = 7; break;
            case "eight": stringNumber = 8; break;
            case "nine": stringNumber = 9; break;
            case "ten": stringNumber = 10; break;
            case "eleven": stringNumber = 11; break;
            case "twelve": stringNumber = 12; break;

            case "thirteen": stringNumber = 13; break;
            case "fourteen": stringNumber = 14; break;
            case "fifteen": stringNumber = 15; break;
            case "sixteen": stringNumber = 16; break;
            case "seventeen": stringNumber = 17; break;
            case "eighteen": stringNumber = 18; break;
            case "nineteen": stringNumber = 19; break;

            case "twenty": stringNumber = 20; break;
            case "thirty": stringNumber = 30; break;
            case "forty": stringNumber = 40; break;
            case "fifty": stringNumber = 50; break;
            case "sixty": stringNumber = 60; break;
            case "eighty": stringNumber = 80; break;
            case "ninety": stringNumber = 90; break;
        }
        return stringNumber;
    }

    public int parse(String str){
       String[] splitedString =  str.split(" ");
        int totalNumber = 0;

       for(int i = 0; i < splitedString.length; i++){

           if(splitedString[i].equals("thousand")){
               totalNumber *= 1000; continue;
           }
           try {
               if(splitedString[i + 1].equals("hundred")){
                   totalNumber += switcher(splitedString[i]) * 100; continue;

               }
           } catch (ArrayIndexOutOfBoundsException e){

           }
          totalNumber +=  switcher(splitedString[i]);

       }
        return totalNumber;
    }
}
