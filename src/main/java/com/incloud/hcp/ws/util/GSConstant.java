package com.incloud.hcp.ws.util;

public class GSConstant {

    //TODO: pasarlo a BD o destination
    //public static final String URL_API_GS_TEST = "http://wsdynamics.grupotasa.com.pe:81/GS/api";
    //public static final String KEY_API_GS_TEST = "bfab392a7caf553f9010b25d89bbde92479a05a193e615778c7e3e18b236d875";

    public static final String PATH_API_GS_PROVEEDOR_REGISTRO = "Agenda/IPROV_RegistrarProveedor";
    public static final String PATH_API_GS_OBTENER_ALMACEN = "general/IPROV_ObtenerAlmacen";
    public static final String PATH_API_GS_COMPRA_SOLICITUD = "Compras/IPROV_ObtenerSolicitudCompra";
    public static final String PATH_API_GS_PRODUCTO_OBTENER = "kardex/IPROV_ObtenerProductos";
    public static final String PATH_API_GS_COMPRA_REGISTRAR = "Compras/IPROV_RegistrarOrdenCompra";
    public static final String PATH_API_GS_TIPOCAMBIO_OBTENER = "general/IPROV_ObtenerTipoCambio";
    public static final String PATH_API_GS_OCPENDIENTE_OBTENER = "Compras/IPROV_ObtenerOCPendientes";
    public static final String PATH_API_GS_GUIA_OBTENER = "almacen/IPROV_ObtenerGuiaCompra";
    public static final String PATH_API_GS_DOC_PENDIENTES_OBTENER = "CtaCte/IPROV_ObtenerDocPendientesProveedores";
    public static final String PATH_API_GS_DOCUMENTOS_REGISTRO = "Compras/IPROV_RegistrarFactura";
    public static final String PATH_API_GS_CONDICION_PAGO = "General/IPROV_CondicionPago";
    public static final String PATH_API_GS_COMPROBANTE_RETENCION = "Compras/IPROV_RETENCIONES";
    public static final String PATH_API_GS_DOCUMENTOS_REGISTRO_SERVICIO = "Compras/IPROV_RegistrarFacturaServicio";
    public static final String PATH_API_GS_DOCUMENTOS_ANULADOS = "Compras/IPROV_DOCANULADOS";
    public static final String PATH_API_GS_ASIGNAR_FECHA_DOCUMENTO = "CtaCte/IPROV_AsignarFechaDocumento";
    public static final String PATH_API_GS_OC_ANULADOS = "compras/IPROV_ObtenerOCAnulados";
    public static final String PATH_API_GS_GUIA_ANULADOS = "Almacen/IPROV_ObtenerGuiaCompraAnulada";

    /* PARAMATROS GS*/
    public static final String PARAMETRO_MODULO_PROVEEDOR = "PROVEEDOR";
    public static final String PARAMETRO_TIPO_GET_SUNAT_FREE = "RUTA_SUNAT_FREE";
    public static final String PARAMETRO_MODULO_PUBLICACION = "PUBLICACION";
    public static final String PARAMETRO_TIPO_EXT_FECHA_INIT = "EXT_FECHA_INIT";
    public static final String PARAMETRO_TIPO_EXT_PROV = "EXT_PROV";
    public static final String EXTRACCION_PROVEEDOR_ALL = "ALL";
    public static final String EXTRACCION_PROVEEDOR_ONLY_REGISTERED = "ONLY_REGISTERED";

}
