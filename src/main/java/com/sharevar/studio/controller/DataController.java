package com.sharevar.studio.controller;

import com.sharevar.studio.domain.Response;
import org.springframework.data.jpa.repository.query.PartTreeJpaQuery;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public Response dataPostOp(Object object) {
        System.out.println(object.toString());
        return new Response(object);
    }
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public Response dataGetOp(Object object) {
        System.out.println(object.toString());
        return new Response(object);
    }
}
