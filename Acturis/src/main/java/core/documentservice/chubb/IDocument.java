package core.documentservice.chubb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-22T11:12:47.886+01:00
 * Generated source version: 3.3.3
 *
 */
@WebService(targetNamespace = "Chubb.DocumentService.Core", name = "IDocument")
@XmlSeeAlso({ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, datacontracts.core.documentservice.chubb._2016._03.ObjectFactory.class})
public interface IDocument {

    @WebMethod(operationName = "TransferDocument", action = "Chubb.DocumentService.Core/IDocument/TransferDocument")
    @Action(input = "Chubb.DocumentService.Core/IDocument/TransferDocument", output = "Chubb.DocumentService.Core/IDocument/TransferDocumentResponse")
    @RequestWrapper(localName = "TransferDocument", targetNamespace = "Chubb.DocumentService.Core", className = "core.documentservice.chubb.TransferDocument")
    @ResponseWrapper(localName = "TransferDocumentResponse", targetNamespace = "Chubb.DocumentService.Core", className = "core.documentservice.chubb.TransferDocumentResponse")
    @WebResult(name = "TransferDocumentResult", targetNamespace = "Chubb.DocumentService.Core")
    public datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse transferDocument(

        @WebParam(name = "transferDocumentRequest", targetNamespace = "Chubb.DocumentService.Core")
        datacontracts.core.documentservice.chubb._2016._03.TransferDocumentRequest transferDocumentRequest
    );
}
