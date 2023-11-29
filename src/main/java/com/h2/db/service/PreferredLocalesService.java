package com.h2.db.service;


import com.h2.db.domain.PreferredLocales;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link PreferredLocales}.
 */
public interface PreferredLocalesService {
    /**
     * Save a preferredLocales.
     *
     * @param preferredLocales the entity to save.
     * @return the persisted entity.
     */
    PreferredLocales save(PreferredLocales preferredLocales);

    /**
     * Updates a preferredLocales.
     *
     * @param preferredLocales the entity to update.
     * @return the persisted entity.
     */
    PreferredLocales update(PreferredLocales preferredLocales);

    /**
     * Partially updates a preferredLocales.
     *
     * @param preferredLocales the entity to update partially.
     * @return the persisted entity.
     */
    Optional<PreferredLocales> partialUpdate(PreferredLocales preferredLocales);

    /**
     * Get all the preferredLocales.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<PreferredLocales> findAll(Pageable pageable);

    /**
     * Get the "id" preferredLocales.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PreferredLocales> findOne(Long id);

    /**
     * Delete the "id" preferredLocales.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
