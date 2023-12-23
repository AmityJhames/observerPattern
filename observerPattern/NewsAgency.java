package observerPattern;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencyPatron {

    public String getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(String newsCategory) {
        this.newsCategory = newsCategory;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public void dispatchNews(){
        System.out.println("(" + getNewsCategory() + ")\n" +getNewsContent());
        this.notifySubscriber();
    }

    private String newsCategory;
    private String newsContent;
    private List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Subscriber patron) {
        subscriberList.add(patron);
    }

    @Override
    public void unsubscribe(Subscriber patron) {
        subscriberList.remove(patron);
    }

    @Override
    public void notifySubscriber() {
        System.out.println(".................<Currently Notifying Patrons>.................");
        int subscriberListSize = subscriberList.size();
        for (int i = 0; i < subscriberListSize; i++) {
            Subscriber patrons = subscriberList.get(i);
            patrons.notifySubscribers(this);
        }
        System.out.println(".................<Done Notifying Patrons>.................\n");
    }
}

