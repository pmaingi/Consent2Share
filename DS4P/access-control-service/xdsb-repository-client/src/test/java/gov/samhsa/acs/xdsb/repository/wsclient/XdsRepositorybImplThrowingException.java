/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package gov.samhsa.acs.xdsb.repository.wsclient;

import ihe.iti.xds_b._2007.ProvideAndRegisterDocumentSetRequest;
import ihe.iti.xds_b._2007.RetrieveDocumentSetRequest;
import ihe.iti.xds_b._2007.XDSRepository;

import java.util.logging.Logger;

import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponse;

/**
 * This class was generated by Apache CXF 2.6.0 2012-11-18T23:54:47.950-05:00
 * Generated source version: 2.6.0
 *
 */

@javax.jws.WebService(serviceName = "DocumentRepositoryService", portName = "XDSRepository_HTTP_Endpoint", targetNamespace = "http://tempuri.org/", wsdlLocation = "classpath:XDS.b_repository.net.wsdl", endpointInterface = "ihe.iti.xds_b._2007.XDSRepository")
public class XdsRepositorybImplThrowingException implements XDSRepository {

	private static final Logger LOG = Logger.getLogger(XdsRepositorybImpl.class
			.getName());
	protected static ihe.iti.xds_b._2007.RetrieveDocumentSetResponse returnedValueOfRetrieveDocumentSet;
	protected static RegistryResponse returnedValueOfProvideAndRegisterDocumentSet;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * ihe.iti.xds_b._2007.XDSRepository#provideAndRegisterDocumentSet(ihe.iti
	 * .xds_b._2007.ProvideAndRegisterDocumentSetRequest input )*
	 */
	@Override
	public RegistryResponse provideAndRegisterDocumentSet(
			ProvideAndRegisterDocumentSetRequest input) {
		LOG.info("Executing operation provideAndRegisterDocumentSet");
		throw new RuntimeException();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * ihe.iti.xds_b._2007.XDSRepository#retrieveDocumentSet(ihe.iti.xds_b._2007
	 * .RetrieveDocumentSetRequest input )*
	 */
	@Override
	public ihe.iti.xds_b._2007.RetrieveDocumentSetResponse retrieveDocumentSet(
			RetrieveDocumentSetRequest input) {
		LOG.info("Executing operation retrieveDocumentSet");
		throw new RuntimeException();
	}

}
