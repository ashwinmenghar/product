package dev.ashwin.productservicettsevening;

import dev.ashwin.productservicettsevening.models.Category;
import dev.ashwin.productservicettsevening.models.Product;
import dev.ashwin.productservicettsevening.repositories.CategoryRepository;
import dev.ashwin.productservicettsevening.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void savingProductsAndCategory() {
//        Category category = new Category();
//        category.setName("phones");
////        Category savedCategory = categoryRepository.save(category);
//
//        Product product = new Product();
//        product.setPrice(100);
//        product.setTitle("Ashwin");
//        product.setImageUrl("hello");
//        product.setCategory(category);
//        productRepository.save(product);

        Category category = new Category();
        category.setName("electronics");
//        Category savedCategory = categoryRepository.save(category);

        Product product = new Product();
        product.setPrice(101);
        product.setImageUrl("hiii");
        product.setCategory(category);
        productRepository.save(product);
    }

    @Test
    @Transactional
    void fetchTypesTest() {
        Product product = productRepository.findProductById(302L);

        System.out.println("Fetched product");

        Category category = product.getCategory();
        String name = category.getName();
    }

    @Test
    void deleteProduct() {
        productRepository.deleteById(552L);


    }
}