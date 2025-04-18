package simplex.bn25._4.server.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import simplex.bn25._4.server.model.Stock;
import simplex.bn25._4.server.model.Trade;

import java.util.List;

@Repository
public class TradeRepository {
    private final JdbcTemplate jdbcTemplate;
    private final DataClassRowMapper<Trade> mapper = new DataClassRowMapper<>(Trade.class);

    @Autowired
    public TradeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Trade> listAll(){
        return this.jdbcTemplate.query("select * from trade", mapper);
    }

    public Trade register(Trade nerTrade){
        return this.jdbcTemplate.query("insert into trade(ticker, name, market, shares_issued) values(?,?,?,?,?)",
                mapper,
                nerTrade.getTicker(),
                nerTrade.getName(),
                nerTrade.getSide().name(),
                nerTrade.getTraded_date(),
                nerTrade.getTraded_price()
        ).get(0);
    }
}
