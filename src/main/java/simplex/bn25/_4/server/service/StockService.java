package simplex.bn25._4.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplex.bn25._4.server.model.Stock;
import simplex.bn25._4.server.repository.StockRepository;

import java.util.List;

@Service
public class StockService {
    private final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> listAll(){
        return stockRepository.listAll();
    }

    public void register(Stock newStock){
        stockRepository.register(newStock);
    }



}
