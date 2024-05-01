package org.example.app.client.api;

import jakarta.xml.ws.Service;
import org.example.app.client.utils.Constants;
import org.example.app.server.service.DataService;

import javax.xml.namespace.QName;
import java.net.URI;
import java.net.URL;

public class DataClient {

    public String runClient(String data) throws Exception {
        URL url = URI.create(Constants.WSDL_URL).toURL();

        QName qname = new QName(
                "http://service.server.app.example.org/",
                "DataServiceImplService"
        );
        Service service = Service.create(url, qname);
        DataService dataService = service.getPort(DataService.class);
        return dataService.getData(data);
    }
}