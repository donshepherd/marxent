package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 * @author Don Shepherd
 * @since 10/31/16
 */
@RepositoryRestController
public interface SolutionRepository extends JpaRepository<Solution, Long> {

}
