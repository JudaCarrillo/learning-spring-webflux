package com.dev.motlrolo.invoice.domain.interfaces;

import com.dev.motlrolo.invoice.domain.models.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice, Integer> {
}
