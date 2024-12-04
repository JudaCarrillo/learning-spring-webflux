package com.dev.motlrolo.invoice.application.services;

import com.dev.motlrolo.invoice.domain.interfaces.IInvoiceService;
import com.dev.motlrolo.invoice.domain.interfaces.InvoiceRepository;
import com.dev.motlrolo.invoice.domain.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public Mono<Invoice> saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public Flux<Invoice> findAllInvoices() {
        return invoiceRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Invoice> findInvoiceById(Integer id) {
        return invoiceRepository.findById(id).switchIfEmpty(Mono.empty());
    }

    public Mono<Void> deleteInvoice(Integer id) {
        return invoiceRepository.deleteById(id);
    }

}
