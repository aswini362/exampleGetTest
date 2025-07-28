package DSA.Basic.Maths;

public class ExcelSheetColumnNumber {

    public static void main(String...args){
        System.out.println(titleToNumber("AA"));
    }


    public static int titleToNumber(String columnTitle) {
        int results=0;

        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int cha = ch - 'A'+1;
            results=results*26+cha;
        }
        return results;
    }
}
