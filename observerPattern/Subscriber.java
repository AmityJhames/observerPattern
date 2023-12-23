package observerPattern;
public class Subscriber implements SubscriberNotif {

    private String patronName;

    public void setSubscribersName(String patronName){
        this.patronName = patronName;
    }
    public String getSubscribersName(){
        return patronName;
    }
    @Override
    public void notifySubscribers(NewsAgency newsAgency) {
        System.out.println("\t\t\t\t\tNotifying: " + getSubscribersName());}
}