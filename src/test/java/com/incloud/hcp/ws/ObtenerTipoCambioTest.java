package com.incloud.hcp.ws;

import com.incloud.hcp.ws.tipoCambio.dto.TipoCambioGSDto;
import org.junit.Before;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@Ignore
public class ObtenerTipoCambioTest {

    TipoCambioGSDto datos;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

//    GSTipoCambioService gsObtenerTipoCambioService = new GSTipoCambioServiceImpl();

    @Before
    public void init() throws IOException {

        datos= new TipoCambioGSDto();

        datos.setFecha("01/01/2020");;
        datos.setIdEmpresa(1);

    }

//    @Test
//    public void obtenerTipoCambio(){
//
//        try {
//           TipoCambioResponse result = gsObtenerTipoCambioService.obtenerTipoCambio(datos.getIdEmpresa(), datos.getFecha());
//            logger.info("Response: {}", result.toString());
//            Assert.assertNotNull(result.getBody());
//
//        } catch (Exception e) {
//            Assert.fail("WS Exception " + e.getMessage());
//        }
//    }
}
