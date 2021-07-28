package com.incloud.hcp.jco.gestionpesca.service.impl;

import com.incloud.hcp.jco.gestionpesca.dto.EmbarcacionDto;
import com.incloud.hcp.jco.gestionpesca.service.JCOEmbarcacionService;
import com.sap.conn.jco.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
public class JCOEmbarcacionServiceImpl implements JCOEmbarcacionService {

    public List<EmbarcacionDto> listaEmbarcacion(String condicion) throws Exception {

        List<EmbarcacionDto> listaEmbarcacion = new ArrayList<EmbarcacionDto>();
        JCoDestination destination = JCoDestinationManager.getDestination("TASA_DEST_RFC_FLOTA");
        JCoRepository repo = destination.getRepository();
        JCoFunction stfcConnection = repo.getFunction("ZFL_RFC_CONS_EMBARCA");
        stfcConnection.getImportParameterList().setValue("P_USER","FGARCIA");

        JCoParameterList tables = stfcConnection.getTableParameterList();
        JCoTable tableImport = tables.getTable("P_OPTIONS");
        tableImport.appendRow();
        tableImport.setValue("WA", condicion);
        //Ejecutar Funcion
        stfcConnection.execute(destination);

        //Recuperar Datos de SAP

        JCoTable tableExport = tables.getTable("STR_EMB");

        for (int i = 0; i < tableExport.getNumRows(); i++) {
            tableExport.setRow(i);
            EmbarcacionDto dto = new EmbarcacionDto();

            dto.setCodigoEmbarcacion(tableExport.getString("CDEMB"));
            dto.setNombreEmbarcacion(tableExport.getString("NMEMB"));
            listaEmbarcacion.add(dto);
            //lista.add(param);
        }

        return listaEmbarcacion;
    }
}
