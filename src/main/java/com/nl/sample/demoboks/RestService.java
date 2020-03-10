/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nl.sample.demoboks;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RestService {
    private BookRepository bookRepository;

    @Autowired
    public RestService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBookStats(Long id){
        BookEntity book= bookRepository.findById(id);
        String result="{ID : "+book.getId().toString()+",Title : "+book.getTitle()+",Author :"+ book.getAuthor()+" }";

        return result;
    }
}