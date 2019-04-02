package com.lexandro.service;

import com.lexandro.annotations.Command;
import com.lexandro.annotations.CustomApi;
import com.lexandro.annotations.Event;
import com.lexandro.annotations.Request;
import com.lexandro.service.vo.CommandObject;
import com.lexandro.service.vo.MyEventObject;
import com.lexandro.service.vo.RequestArgument;
import com.lexandro.service.vo.RequestResult;

import java.util.List;

@CustomApi
public interface ExampleApi {

    @Event("vo.entity.simpleEvent")
    void SimpleEvent(String eventMessage);

    @Event(domain = "domain2", entity = "myEntity", event = "veryComplexEvent")
    void ComplexEvent(MyEventObject myEvent);

    @Command("vo.commandEntity.justACommand")
    void aCommand(CommandObject commandObject);

    @Request("domain3.requestEntity.singletonRequest")
    RequestResult newReqest(RequestArgument argument);

    @Request("domain3.requestEntity.singletonRequest")
    List<RequestResult> newReqest(List<String> idList);


}

