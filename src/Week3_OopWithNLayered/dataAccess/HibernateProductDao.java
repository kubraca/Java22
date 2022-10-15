package Week3_OopWithNLayered.dataAccess;

import Week3_OopWithNLayered.entites.ProductEntity;

public class HibernateProductDao implements ProductDao {
    public void addEntity(ProductEntity productEntity){
        System.out.println("Hibernate veri tabanına eklendi");
    }
}
