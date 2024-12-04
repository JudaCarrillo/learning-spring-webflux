package com.motlrolo.myfirstproject.domain.interfaces;

import com.motlrolo.myfirstproject.domain.models.Invoice;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IInvoiceService {
    public Mono<Invoice> saveInvoice(Invoice invoice);

    public Flux<Invoice> findAllInvoices();

    public Mono<Invoice> findInvoiceById(Integer id);

    public Mono<Void> deleteInvoice(Integer id);

}
