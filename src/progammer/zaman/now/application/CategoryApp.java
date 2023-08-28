package progammer.zaman.now.application;

import progammer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {


        var category =  new Category();
        category.setId("ID");
        category.setId(null);

        System.out.println(category.getId());

    }
}
