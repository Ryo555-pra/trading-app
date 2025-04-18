package simplex.bn25._4.server.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Trade {
    private int id;
    private String ticker;
    private String name;
    private LocalDateTime traded_date;
    private Side side;
    private long quantity;
    private BigDecimal traded_price;

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

    public LocalDateTime getTraded_date() {
        return traded_date;
    }

    public void setTraded_date(LocalDateTime traded_date) {
        this.traded_date = traded_date;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTraded_price() {
        return traded_price;
    }

    public void setTraded_price(BigDecimal traded_price) {
        this.traded_price = traded_price;
    }
}
