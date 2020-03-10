/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nl.sample.demoboks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/book")
@ResponseBody
public class RestController {
    private final RestService restService;

    @Autowired
    public RestController(RestService restService) {
        this.restService = restService;
    }
    @RequestMapping(value = "data", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity onResRequest(@RequestParam(value = "id") String id){
        Long Id = Long.parseLong(id);
        return ResponseEntity.ok(restService.getBookStats(Id));
    }
}