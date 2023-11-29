package com.h2.db.repository;

import com.h2.db.domain.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the LineItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LineItemRepository extends JpaRepository<LineItem, String> {}
