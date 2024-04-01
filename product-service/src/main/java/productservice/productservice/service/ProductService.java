package productservice.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import productservice.productservice.model.Product;
import productservice.productservice.repository.ProductRepository;
import productservice.productservice.dto.ProductRequest;
import productservice.productservice.dto.ProductResponse;


@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    
    private final ProductRepository productRespository;


    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                                .name(productRequest.getName())
                                .description(productRequest.getDescription())
                                .price(productRequest.getPrice())
                                .build();
        
        productRespository.save(product);
        
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRespository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                                .id(product.getId())
                                .name(product.getName())
                                .description(product.getDescription())
                                .price(product.getPrice())
                                .build();
    }

}
