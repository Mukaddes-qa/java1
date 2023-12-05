package day33;

public class WarmUp {
    public static void main(String[] args) {
      String spelledName =  getSpelledName("SERRA");
        System.out.println(spelledName);

        System.out.println(getSpelledName("Zeynep"));
    }
    public static String getSpelledName(String name) {
        String result="";
        for (int i = 0; i < name.length(); i++) {
          result=result+name.charAt(i);
          if(i!=name.length()-1){
              result= result + "-";
          }

        }
        return result;
    }
    public static String getSpelledName2(String name) {
        String result = "";
        for (int i = 0; i < name.length()-1; i++) {
            result+=name.charAt(i)+"-";
        }
        result+=name.charAt(name.length()-1);

        return result;
    }
}
