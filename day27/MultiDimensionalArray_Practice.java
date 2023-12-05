package day27;

public class MultiDimensionalArray_Practice {
    public static void main(String[] args) {
        String[] developersTeam = {"Vlasdislav", "Hasan", "Tolkun","Abide"};
        String[] testersTeam = {"Zhibeckchach","Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysisTeam = { " Lisa", "Ershad", "Naila"};

        String [][] scrumTeam = {developersTeam,testersTeam,businessAnalysisTeam};

        int maxLength= scrumTeam[0][0].length();
        String longestString = "";
        for(String[] each1DArray : scrumTeam){
            for (String eachElement: each1DArray){
                if(maxLength<eachElement.length()){
                    maxLength=eachElement.length();
                    longestString=eachElement;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);
    }

}
