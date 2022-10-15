package Week3_OopWithNLayered.dataAccess;


import Week3_OopWithNLayered.entites.ProductEntity;

public class JdbcProductDao implements ProductDao {
    //sadece db erişim kodları buraya yazılır--SQL
    public void addEntity(ProductEntity productEntity){
        System.out.println("JDBC veri tabanına eklendi");
    }


}
