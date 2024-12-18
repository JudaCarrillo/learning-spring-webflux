package com.dev.motlrolo.invoice.domain.interfaces;

import com.dev.motlrolo.invoice.domain.models.Invoice;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IInvoiceService {
    Mono<Invoice> saveInvoice(Invoice invoice);

    Flux<Invoice> findAllInvoices();

    Mono<Invoice> findInvoiceById(Integer id);

    Mono<Boolean> deleteInvoice(Integer id);

}
