import java.util.Locale;

interface StringFun {
    String func(String n);
}
public class LambdaAsArgumentDemo {
    static String stringOp(StringFun sf,String s){
        return sf.func(s);
    }
    public static void main (String args[]){
        String inStr = "Лябмда-выражение повышают эффектвность Java";
        String outStr;

        System.out.println("ИСходная строка: "+inStr);

        outStr = stringOp((str) -> str.toUpperCase(),inStr);
        System.out.println("Это строка в верхнем регистре: "+ outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i=0;i< str.length();i++)
                if(str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;

        },inStr);
        System.out.println("Это строка без пробелов: "+ outStr);

        StringFun reverse = (str) -> {
            String result="";
            int i;
            for (i = str.length()-1;i>=0;i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Строка в обратном порядке: "+ stringOp(reverse,inStr));

    }
}
