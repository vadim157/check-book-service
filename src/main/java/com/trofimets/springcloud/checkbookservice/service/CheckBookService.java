package com.trofimets.springcloud.checkbookservice.service;

import com.trofimets.springcloud.checkbookservice.model.Book;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;
import java.util.logging.Level;
import java.util.logging.Logger;


@Service
@MessageEndpoint
@EnableBinding(Processor.class)
public class CheckBookService {
    private final Logger logger = Logger.getLogger(CheckBookService.class.getName());

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Book updateBook(Book book) throws Exception {
        book.setStatus("checked");
        logger.log(Level.INFO, "Checked " + book);
        return book;
    }
}
