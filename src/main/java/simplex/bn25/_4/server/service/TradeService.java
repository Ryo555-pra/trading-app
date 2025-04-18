package simplex.bn25._4.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplex.bn25._4.server.model.Stock;
import simplex.bn25._4.server.model.Trade;
import simplex.bn25._4.server.repository.StockRepository;

import java.util.List;

@Service
public class TradeService {
    private final TradeService tradeRepository;

    @Autowired
    public TradeService(TradeService tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public List<Trade> listAll(){
        return tradeRepository.listAll();
    }

    public void register(Stock newTrade){
        tradeRepository.register(newTrade);
    }
}
