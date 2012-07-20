package cn.emay.sdk.api;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * SDKService service = new SDKService();
 * SDKClient portType = service.getSDKService();
 * portType.getVersion(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "SDKService", targetNamespace = "http://sdkhttp.eucp.b2m.cn/", wsdlLocation = "http://localhost:8080/sdkproxy/SDKService?wsdl")
public class SDKService extends Service {

	private final static URL SDKSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(cn.emay.sdk.api.SDKService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = cn.emay.sdk.api.SDKService.class.getResource(".");
			url = new URL(baseUrl,"http://sdkhttp.eucp.b2m.cn/sdk/SDKService?wsdl");
			//url = new URL(baseUrl,"http://localhost:8081/sdkproxy/SDKService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/sdkproxy/SDKService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		SDKSERVICE_WSDL_LOCATION = url;
	}

	public SDKService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public SDKService() {
		super(SDKSERVICE_WSDL_LOCATION, new QName("http://sdkhttp.eucp.b2m.cn/", "SDKService"));
	}

	/**
	 * 
	 * @return returns SDKClient
	 */
	@WebEndpoint(name = "SDKService")
	public SDKClient getSDKService() {
		return super.getPort(new QName("http://sdkhttp.eucp.b2m.cn/","SDKService"), SDKClient.class);
	}

}