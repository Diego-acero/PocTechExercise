package com.acero.iobuilder.tech.exercise.application.rest;

import com.acero.iobuilder.tech.exercise.domain.ports.primary.EtherSender;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEtherController {

    @Autowired
    private EtherSender etherSender;

    @PostMapping(path = "/send", consumes = "application/json", produces = "aplication/json")
    @ResponseBody
    private String sendEther(@RequestBody SendInfo sendInfo)
    {
        Gson gson = new Gson();
        return gson.toJson(etherSender.send(sendInfo));
    }

}
