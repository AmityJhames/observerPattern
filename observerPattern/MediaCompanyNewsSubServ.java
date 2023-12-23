package observerPattern;

public class MediaCompanyNewsSubServ {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber patOne = new Subscriber();
        Subscriber patTwo = new Subscriber();
        Subscriber patThree = new Subscriber();

        patOne.setSubscribersName("Myel");
        patTwo.setSubscribersName("Marielle");
        patThree.setSubscribersName("Amiel");

        newsAgency.subscribe(patOne);
        newsAgency.subscribe(patTwo);
        newsAgency.subscribe(patThree);

        newsAgency.setNewsCategory("LOCAL HEADLINES");
        newsAgency.setNewsContent("HEADLINES: DICT: Cyberattacks to intensify in 2024" +
                                "\n\n\tCYBERATTACKS will become more frequent and more severe next year, " +
                                  "\n\tDepartment of Information and Communications Technology (DICT) Secretary Ivan John Uy " +
                                    "\n\twarned on Thursday. Speaking during The Manila Times forum," +
                                    " \n\t\"Tech trends, financial forecasts,\" and in interviews later with reporters");

        newsAgency.dispatchNews();

        newsAgency.unsubscribe(patTwo);

        Subscriber patFour = new Subscriber();
        Subscriber patFive = new Subscriber();

        patFour.setSubscribersName("Amalia");
        patFive.setSubscribersName("Theodore");

        newsAgency.setNewsCategory("INTERNATIONAL HEADLINES");
        newsAgency.setNewsContent("Israel-Hamas War News" +
                "\n\n\t After Hamas led deadly attacks in Israel on Oct. 7, Israel has conducted intense bombing" +
                "\n\t and ground campaigns in Gaza. The war and the humanitarian crisis in the besieged enclave have" +
                "\n\t shaken the region and the world.");

        newsAgency.dispatchNews();
    }

}