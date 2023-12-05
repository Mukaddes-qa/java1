package day29;

public class HeroIdentity_JusticeLeage {
    public static void main(String[] args) {
        String[] allHeros ={"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for( String eachHero: allHeros) {

            // assume this can be different hero
            String hero1 = eachHero;
            // hide this hero identity
            //String heroX = "Superman-************";

            String[] heroSplitted = hero1.split("-");
            String heroCode = heroSplitted[0];
            String fullName = heroSplitted[1];

            int nameCharCount = fullName.length();
            String stars = "";
            for (int i = 0; i < nameCharCount; i++) {
                stars = stars + "*"; // stars +="*";
            }


            String heroX = heroCode + "-" + stars;
            System.out.println("hero = " + hero1);
            System.out.println("heroX = " + heroX);
        }
    }
}
