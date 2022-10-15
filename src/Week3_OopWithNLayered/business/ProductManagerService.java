package Week3_OopWithNLayered.business;


import Week3_OopWithNLayered.core.logging.Logger;
import Week3_OopWithNLayered.dataAccess.JdbcProductDao;
import Week3_OopWithNLayered.dataAccess.ProductDao;
import Week3_OopWithNLayered.entites.ProductEntity;

import java.util.List;

public class ProductManagerService {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManagerService(ProductDao productDao,List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }
    public void addProductToDBFromService(ProductEntity productEntity) throws Exception{
        if(productEntity.getUnitPrice()<10){
           throw new Exception("Bir ürün fiyatı 10 dan küçük olamaz.");
       // if bloğuna girerse kod durur, girmezse ürün dbye kaydolur.
        }

        for(Logger logger:loggers){
            logger.log(productEntity.getProductName());
        }

        productDao.addEntity(productEntity);//productdaonun addEntity methodunu cagırdık.
    }
}
