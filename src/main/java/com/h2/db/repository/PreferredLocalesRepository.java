package com.h2.db.repository;

import com.h2.db.domain.PreferredLocales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PreferredLocales entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PreferredLocalesRepository extends JpaRepository<PreferredLocales, Long> {}
