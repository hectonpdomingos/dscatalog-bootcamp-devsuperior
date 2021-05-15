package com.devsuperior.dscatalog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Category;

//camada de dados

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {



	List<Category> findAll();

}
