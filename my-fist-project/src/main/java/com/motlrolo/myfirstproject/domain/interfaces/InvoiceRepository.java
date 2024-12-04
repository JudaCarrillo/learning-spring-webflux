package com.motlrolo.myfirstproject.domain.interfaces;

import com.motlrolo.myfirstproject.domain.models.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice, Integer> {
}
