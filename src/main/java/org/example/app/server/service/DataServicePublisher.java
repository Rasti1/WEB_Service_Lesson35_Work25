package org.example.app.server.service;

import jakarta.xml.ws.Endpoint;
import org.example.app.server.utils.Constants;

public class DataServicePublisher {

    public void publish() {
        Endpoint.publish(Constants.BASE_URL, new DataServiceImpl());
    }
}
