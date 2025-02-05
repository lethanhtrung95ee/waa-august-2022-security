package waa.lab6.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.lab6.entity.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
}

