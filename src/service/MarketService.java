package service;

import classes.Client;
import classes.Market;
import enums.Bank;
import enums.Product;
import enums.Region;

import java.util.ArrayList;
import java.util.List;

public interface MarketService {
    String creatClient();
    List<Client> getAllClient();
    String creatMarket();
    List<Market> getAllMarket();
    List<Product> getAllProducts();
    Market chooseMarketByName();
    String deleteProductFromMarket(String name, List<Market> markets);
    void payMoney();
    String getMarketAddress();
    List<Region> getRegion();
    List<Bank> getBank();
    void sortByPrice();
    void getProductMarket();

}
