package productservice.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import productservice.productservice.model.Product;;


public interface ProductRepository extends MongoRepository<Product, String> {
    
}
