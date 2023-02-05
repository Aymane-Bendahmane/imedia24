package com.imedia.project.repositories;

import com.imedia.project.entites.Category;
import com.imedia.project.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product , Long> {
    List<Product> findProductsByCategory(Category category);
}
