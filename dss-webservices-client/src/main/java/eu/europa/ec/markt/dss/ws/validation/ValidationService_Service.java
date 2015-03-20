/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.ec.markt.dss.ws.validation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 */
@WebServiceClient(name = "ValidationService", targetNamespace = "http://impl.ws.dss.markt.ec.europa.eu/",
	  wsdlLocation = "http://localhost:8080/wservice/validationService?wsdl")
public class ValidationService_Service extends Service {

	private static final String METHOD_URL = "/validationService?wsdl";
	private static URL VALIDATIONSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(eu.europa.ec.markt.dss.ws.validation.ValidationService_Service.class.getName());

/*
	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = eu.europa.ec.markt.dss.ws.validation.ValidationService_Service.class.getResource(".");
			url = new URL(baseUrl, "http://localhost:8080/wservice/validationService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/wservice/validationService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		VALIDATIONSERVICE_WSDL_LOCATION = url;
	}
*/

    public static void setROOT_SERVICE_URL(String ROOT_SERVICE_URL) {

        try {
	        VALIDATIONSERVICE_WSDL_LOCATION = new URL(ROOT_SERVICE_URL + METHOD_URL);
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: '" + VALIDATIONSERVICE_WSDL_LOCATION + "', retrying as a local file");
            logger.warning(e.getMessage());
        }
    }

	public ValidationService_Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ValidationService_Service() {
		super(VALIDATIONSERVICE_WSDL_LOCATION, new QName("http://impl.ws.dss.markt.ec.europa.eu/", "ValidationService"));
	}

	/**
	 * @return returns ValidationService
	 */
	@WebEndpoint(name = "ValidationServiceImplPort")
	public ValidationService getValidationServiceImplPort() {
		return super.getPort(new QName("http://impl.ws.dss.markt.ec.europa.eu/", "ValidationServiceImplPort"), ValidationService.class);
	}

	/**
	 * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their
	 *                 default values.
	 * @return returns ValidationService
	 */
	@WebEndpoint(name = "ValidationServiceImplPort")
	public ValidationService getValidationServiceImplPort(WebServiceFeature... features) {
		return super.getPort(new QName("http://impl.ws.dss.markt.ec.europa.eu/", "ValidationServiceImplPort"), ValidationService.class, features);
	}

}
