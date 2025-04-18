package simplex.bn25._4.server.model;

public class Stock {
    private int id;
    private String ticker;
    private String name;
    private Market market;
    private long sharesIssued;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public long getSharesIssued() {
        return sharesIssued;
    }

    public void setSharesIssued(long sharesIssued) {
        this.sharesIssued = sharesIssued;
    }
}
