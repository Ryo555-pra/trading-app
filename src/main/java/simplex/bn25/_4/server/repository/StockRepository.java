package simplex.bn25._4.server.repository;

import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import simplex.bn25._4.server.model.Stock;

import java.util.List;

@Repository
public class StockRepository {
    private final JdbcTemplate jdbcTemplate;
    private final DataClassRowMapper<Stock> mapper = new DataClassRowMapper<>(Stock.class);

    @Autowired
    public StockRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Stock> listAll(){
        return this.jdbcTemplate.query("select * from stock", mapper);
    }

    public Stock register(Stock newStock){
        return this.jdbcTemplate.query("insert into stock(ticker, name, market, shares_issued) values(?,?,?,?,?)",
                mapper,
                newStock.getTicker(),
                newStock.getName(),
                newStock.getMarket().name(),
                newStock.getSharesIssued()
        ).get(0);
    }

}
