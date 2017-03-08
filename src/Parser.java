/**
 * Created by Roman on 08.03.2017.
 */
public class Parser {

    public void parse(String str){
       String[] splitedString =  str.split(" ");

        int stringNumber = 0;

       for(int i = 0; i < splitedString.length; i++){
           if(splitedString[i].equals("thousand")){
               stringNumber *= 1000; continue;
           }
           if(splitedString[i].equals("hundred")){
               stringNumber *= 100; continue;
           }
           switch (splitedString[i]){
               case "one": stringNumber+= 1; continue;
               case "a": stringNumber+= 1; continue;
               case "two": stringNumber+= 2; continue;
               case "three": stringNumber+= 3; continue;
               case "four": stringNumber+= 4; continue;
               case "five": stringNumber+= 5; continue;
               case "six": stringNumber+= 6; continue;
               case "seven": stringNumber+= 7; continue;
               case "eight": stringNumber+= 8; continue;
               case "nine": stringNumber+= 9; continue;
               case "ten": stringNumber+= 10; continue;
               case "eleven": stringNumber+= 11; continue;
               case "twelve": stringNumber+= 12; continue;

               case "thirteen": stringNumber+= 13; continue;
               case "fourteen": stringNumber+= 14; continue;
               case "fifteen": stringNumber+= 15; continue;
               case "sixteen": stringNumber+= 16; continue;
               case "seventeen": stringNumber+= 17; continue;
               case "eighteen": stringNumber+= 18; continue;
               case "nineteen": stringNumber+= 19; continue;

               case "twenty": stringNumber+= 20; continue;
               case "thirty": stringNumber+= 30; continue;
               case "forty": stringNumber+= 40; continue;
               case "fifty": stringNumber+= 50; continue;
               case "sixty": stringNumber+= 60; continue;
               case "eighty": stringNumber+= 80; continue;
               case "ninety": stringNumber+= 90; continue;

           }
//           case "hundred": stringNumber+= "100";

       }

    }
}
