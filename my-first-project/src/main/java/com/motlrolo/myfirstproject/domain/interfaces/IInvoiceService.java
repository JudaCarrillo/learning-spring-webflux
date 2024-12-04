package com.motlrolo.myfirstproject.domain.interfaces;

import com.motlrolo.myfirstproject.domain.models.Invoice;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IInvoiceService {
    Mono<Invoice> saveInvoice(Invoice invoice);

    Flux<Invoice> findAllInvoices();

    Mono<Invoice> findInvoiceById(Integer id);

    Mono<Void> deleteInvoice(Integer id);

}
