/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/dto/EntityDTO.java.e.vm
 */
package com.incloud.hcp.service;

import com.incloud.hcp.domain.AppProcesoLog;
import com.incloud.hcp.service.support.PageRequestByExample;
import com.incloud.hcp.service.support.PageResponse;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;
import java.util.Optional;

/**
 * Simple Interface for AppProcesoLog.
 */
public interface AppProcesoLogService {

    Optional<AppProcesoLog> findOne(Integer id);

    List<AppProcesoLog> findAll();

    List<AppProcesoLog> find(AppProcesoLog req);

    PageResponse<AppProcesoLog> findPaginated(PageRequestByExample<AppProcesoLog> req);

    XSSFWorkbook downloadExcelXLSX(AppProcesoLog req);

    SXSSFWorkbook downloadExcelSXLSX(AppProcesoLog req);

    SXSSFWorkbook generateInsertExcelSXLSX(AppProcesoLog req);

    AppProcesoLog save(AppProcesoLog dto);

    AppProcesoLog create(AppProcesoLog dto);

    void delete(Integer id);

    void deleteAll();

}
