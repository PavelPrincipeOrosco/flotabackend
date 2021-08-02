package com.incloud.hcp.job;

import com.incloud.hcp.ws.tipoCambio.service.GSTipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTasks {

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ScheduledTasks.class);

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");



    /*@Autowired
    private AppProcesoLogRepository appProcesoLogRepository;*/


    @Autowired
    private GSTipoCambioService gsObtenerTipoCambioService;






    @Scheduled(cron = "0 5,35 * * * ?")
    public void scheduleEnviarCorreoRecordatorio() {
        logger.error("Cron Task scheduleEnviarCorreoRecordatorio :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));

    }

    @Scheduled(cron = "0 30 5-23 * * ?")
    public void scheduleActualizarTasaCambio() {
        logger.error("Cron Task scheduleActualizarTasaCambio :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));

    }

//    @Scheduled(cron = "0 45 * * * ?")
//    public void scheduleSincronizarBienServicio() {
//        logger.error("Cron Task scheduleSincronizarBienServicio :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
//        try {
//           this.bienServicioService.sincronizarBienServicioByLastDate();
//        }
//        catch (Exception e) {
//            logger.error("Cron Task Fin JOB scheduleSincronizarBienServicio ERROR: " + Utils.obtieneMensajeErrorException(e));
//        }
//        logger.error("Cron Task Fin JOB scheduleSincronizarBienServicio");
//    }

    // Ejecutar todos los dias 1 al 3 de cada mes desde las 6:00 a 9:00 am cada hora
    /*@Scheduled(cron = "0 0 6-9 1-3 * ?")
    public void scheduleEliminarAppProcesoLog() {
        logger.error("Cron Task scheduleEliminarAppProcesoLog :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            Date fechaMenosMes = DateUtils.obtenerFechaActualMinusMonth(1);
            this.appProcesoLogRepository.deleteAllByFechaInicioEjecucionIsBefore(fechaMenosMes);
        }
        catch (Exception e) {
            logger.error("Cron Task Fin JOB scheduleEliminarAppProcesoLog ERROR: " + Utils.obtieneMensajeErrorException(e));
        }
    }*/

    /***********************************/
    /* Procesos de RFC                 */
    /***********************************/

    /*@Scheduled(cron = "0 0 5-7 * * ?")
    public void scheduleActualizarGrupoArticulos() {
        logger.error("Cron Task scheduleActualizarGrupoArticulos :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            this.jcoGrupoArticuloService.actualizarGrupoArticulo();
        }
        catch (Exception e) {
            logger.error("Cron Task Fin JOB scheduleActualizarGrupoArticulos ERROR: " + Utils.obtieneMensajeErrorException(e));
        }
    }

    @Scheduled(cron = "0 30 5-12 * * ?")
    public void scheduleActualizarTasaCambio() {
        logger.error("Cron Task scheduleActualizarTasaCambio :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            Date fecha = DateUtils.obtenerFechaActual();
            String sFecha = DateUtils.convertDateToString("yyyyMMdd", fecha);
            this.jcoTipoCambioService.actualizarTipoCambio(sFecha);
        }
        catch (Exception e) {
            logger.error("Cron Task Fin JOB scheduleActualizarTasaCambio ERROR: " + Utils.obtieneMensajeErrorException(e));
        }
    }

    @Scheduled(cron = "0 45 5-12 * * ?")
    public void scheduleActualizarBienesServicio() {
        logger.error("Cron Task scheduleActualizarBienesServicio :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            Date fecha = DateUtils.obtenerFechaActual();
            String sFecha = DateUtils.convertDateToString("yyyyMMdd", fecha);
            this.jcoUnidadMedidaServiceNew.actualizarUnidadMedida();
            this.jcoGrupoArticuloService.actualizarGrupoArticulo();
            this.jcoMaterialesService.actualizarMaterialesRFC(sFecha, sFecha);
            this.jcoServiciosService.actualizarMaterialesRFC(sFecha, sFecha);
        }
        catch (Exception e) {
            logger.error("Cron Task Fin JOB scheduleActualizarBienesServicio ERROR: " + Utils.obtieneMensajeErrorException(e));
        }
    }

    @Scheduled(cron = "0 10 6-8 1-3 * ?")
    public void scheduleActualizarCentroAlmacen() {
        logger.error("Cron Task scheduleActualizarCentroAlmacen :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            this.jcoCentroServiceNew.actualizarCentro("");
            this.jcoCentroAlmacenService.actualizaCentroAlmacen("");
        }
        catch (Exception e) {
            logger.error("Cron Task Fin JOB scheduleActualizarBienesServicio ERROR: " + Utils.obtieneMensajeErrorException(e));
        }
    }*/



}