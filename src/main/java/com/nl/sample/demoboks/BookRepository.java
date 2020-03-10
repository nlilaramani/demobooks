/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nl.sample.demoboks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<BookEntity,String> {

    BookEntity findById(Long id);

}