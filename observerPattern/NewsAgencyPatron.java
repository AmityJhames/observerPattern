package observerPattern;
public interface NewsAgencyPatron {
    public void subscribe (Subscriber patron);
    public void unsubscribe (Subscriber patron);
    public void notifySubscriber ();
}