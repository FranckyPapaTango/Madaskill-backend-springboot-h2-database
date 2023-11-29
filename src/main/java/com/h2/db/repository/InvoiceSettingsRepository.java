package com.h2.db.repository;


import com.h2.db.domain.InvoiceSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the InvoiceSettings entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InvoiceSettingsRepository extends JpaRepository<InvoiceSettings, Long> {}
