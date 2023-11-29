package com.h2.db.service;


import com.h2.db.domain.LineItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link LineItem}.
 */
public interface LineItemService {
    /**
     * Save a lineItem.
     *
     * @param lineItem the entity to save.
     * @return the persisted entity.
     */
    LineItem save(LineItem lineItem);

    /**
     * Updates a lineItem.
     *
     * @param lineItem the entity to update.
     * @return the persisted entity.
     */
    LineItem update(LineItem lineItem);

    /**
     * Partially updates a lineItem.
     *
     * @param lineItem the entity to update partially.
     * @return the persisted entity.
     */
    Optional<LineItem> partialUpdate(LineItem lineItem);

    /**
     * Get all the lineItems.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<LineItem> findAll(Pageable pageable);

    /**
     * Get the "id" lineItem.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<LineItem> findOne(String id);

    /**
     * Delete the "id" lineItem.
     *
     * @param id the id of the entity.
     */
    void delete(String id);
}
