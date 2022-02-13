package com.surfshop.ecommerce.dao;

import com.surfshop.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:")
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface
CountryRepository extends JpaRepository<Country, Integer> {
}
