package Week3_OopWithNLayered;


import Week3_OopWithNLayered.business.ProductManagerService;
import Week3_OopWithNLayered.core.logging.DataLogger;
import Week3_OopWithNLayered.core.logging.FileLogger;
import Week3_OopWithNLayered.core.logging.Logger;
import Week3_OopWithNLayered.core.logging.MailLogger;
import Week3_OopWithNLayered.dataAccess.JdbcProductDao;
import Week3_OopWithNLayered.entites.ProductEntity;

import java.util.*;

public class Main {//Projede bu class UI görevinde business ile iletişime geçer direk, dbyle gecemez.

    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DataLogger(), new FileLogger(), new MailLogger()};

        ProductEntity productEntity1 = new ProductEntity(1, "Iphone 12", 30000);
        ProductManagerService productManagerService = new ProductManagerService(new JdbcProductDao(), List.of(loggers));

        productManagerService.addProductToDBFromService(productEntity1);
    }
}

