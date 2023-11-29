package com.h2.db.service.impl;


import com.h2.db.domain.InvoiceSettings;
import com.h2.db.repository.InvoiceSettingsRepository;
import com.h2.db.service.InvoiceSettingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link InvoiceSettings}.
 */
@Service
@Transactional
public class InvoiceSettingsServiceImpl implements InvoiceSettingsService {

    private final Logger log = LoggerFactory.getLogger(InvoiceSettingsServiceImpl.class);

    private final InvoiceSettingsRepository invoiceSettingsRepository;

    public InvoiceSettingsServiceImpl(InvoiceSettingsRepository invoiceSettingsRepository) {
        this.invoiceSettingsRepository = invoiceSettingsRepository;
    }

    @Override
    public InvoiceSettings save(InvoiceSettings invoiceSettings) {
        log.debug("Request to save InvoiceSettings : {}", invoiceSettings);
        return invoiceSettingsRepository.save(invoiceSettings);
    }

    @Override
    public InvoiceSettings update(InvoiceSettings invoiceSettings) {
        log.debug("Request to update InvoiceSettings : {}", invoiceSettings);
        return invoiceSettingsRepository.save(invoiceSettings);
    }

    @Override
    public Optional<InvoiceSettings> partialUpdate(InvoiceSettings invoiceSettings) {
        log.debug("Request to partially update InvoiceSettings : {}", invoiceSettings);

        return invoiceSettingsRepository
            .findById(invoiceSettings.getId())
            .map(existingInvoiceSettings -> {
                if (invoiceSettings.getCustomFields() != null) {
                    existingInvoiceSettings.setCustomFields(invoiceSettings.getCustomFields());
                }
                if (invoiceSettings.getDefaultPaymentMethod() != null) {
                    existingInvoiceSettings.setDefaultPaymentMethod(invoiceSettings.getDefaultPaymentMethod());
                }
                if (invoiceSettings.getFooter() != null) {
                    existingInvoiceSettings.setFooter(invoiceSettings.getFooter());
                }
                if (invoiceSettings.getRenderingOptions() != null) {
                    existingInvoiceSettings.setRenderingOptions(invoiceSettings.getRenderingOptions());
                }

                return existingInvoiceSettings;
            })
            .map(invoiceSettingsRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<InvoiceSettings> findAll(Pageable pageable) {
        log.debug("Request to get all InvoiceSettings");
        return invoiceSettingsRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<InvoiceSettings> findOne(Long id) {
        log.debug("Request to get InvoiceSettings : {}", id);
        return invoiceSettingsRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete InvoiceSettings : {}", id);
        invoiceSettingsRepository.deleteById(id);
    }
}
