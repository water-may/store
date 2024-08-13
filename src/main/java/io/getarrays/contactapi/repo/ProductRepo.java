package io.getarrays.contactapi.repo;

import io.getarrays.contactapi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductRepo extends JpaRepository<Product, String> {
    Optional<Product> findById(String id);
}