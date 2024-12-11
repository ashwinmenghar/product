package dev.ashwin.productservicettsevening.services;

import dev.ashwin.productservicettsevening.clients.fakeStoreApi.FakeStoreProductDto;
import dev.ashwin.productservicettsevening.dtos.ProductDto;
import dev.ashwin.productservicettsevening.exceptions.NotFoundException;
import dev.ashwin.productservicettsevening.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();

    Optional<Product> getSingleProduct(Long productId) throws NotFoundException;

    Product addNewProduct(ProductDto product);

    String updateProduct(Long productId, Product product);

    String replaceProduct(Long productId);

    String deleteProduct(Long productId);
}
