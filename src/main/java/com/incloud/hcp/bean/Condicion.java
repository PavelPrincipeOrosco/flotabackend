package com.incloud.hcp.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by USER on 25/09/2017.
 */
public class Condicion implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer idGrupoCondicionLic;
    private Integer idLicitacion;
    private Integer idCondicion;
    private Integer orden;
    private String indBloqueadoProveedor;
    private BigDecimal peso;
    private String pregunta;
    private String tipoCampo;
    private int idTipoLicitacion;
    private String descripcionTipoLicitacion;
    private int idTipoCuestionario;
    private String descripcionTipoCuestionario;
    private String respuestaPredefinida;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private Timestamp fechaCreacion;
    private Timestamp fechaModificacion;
   // private List<RespuestaCondicion> listaRespuestas;

    public Condicion() {
    }

    public Integer getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Integer idCondicion) {
        this.idCondicion = idCondicion;
    }

    public String getIndBloqueadoProveedor() {
        return indBloqueadoProveedor;
    }

    public void setIndBloqueadoProveedor(String indBloqueadoProveedor) {
        this.indBloqueadoProveedor = indBloqueadoProveedor;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTipoCampo() {
        return tipoCampo;
    }

    public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }

    public int getIdTipoLicitacion() {
        return idTipoLicitacion;
    }

    public void setIdTipoLicitacion(int idTipoLicitacion) {
        this.idTipoLicitacion = idTipoLicitacion;
    }

    public String getDescripcionTipoLicitacion() {
        return descripcionTipoLicitacion;
    }

    public void setDescripcionTipoLicitacion(String descripcionTipoLicitacion) {
        this.descripcionTipoLicitacion = descripcionTipoLicitacion;
    }

    public int getIdTipoCuestionario() {
        return idTipoCuestionario;
    }

    public void setIdTipoCuestionario(int idTipoCuestionario) {
        this.idTipoCuestionario = idTipoCuestionario;
    }

    public String getDescripcionTipoCuestionario() {
        return descripcionTipoCuestionario;
    }

    public void setDescripcionTipoCuestionario(String descripcionTipoCuestionario) {
        this.descripcionTipoCuestionario = descripcionTipoCuestionario;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }



    public String getRespuestaPredefinida() {
        return respuestaPredefinida;
    }

    public void setRespuestaPredefinida(String respuestaPredefinida) {
        this.respuestaPredefinida = respuestaPredefinida;
    }

    public Integer getIdGrupoCondicionLic() {
        return idGrupoCondicionLic;
    }

    public void setIdGrupoCondicionLic(Integer idGrupoCondicionLic) {
        this.idGrupoCondicionLic = idGrupoCondicionLic;
    }

    public Integer getIdLicitacion() {
        return idLicitacion;
    }

    public void setIdLicitacion(Integer idLicitacion) {
        this.idLicitacion = idLicitacion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Condicion{" +
                "idGrupoCondicionLic=" + idGrupoCondicionLic +
                ", idLicitacion=" + idLicitacion +
                ", idCondicion=" + idCondicion +
                ", orden=" + orden +
                ", indBloqueadoProveedor='" + indBloqueadoProveedor + '\'' +
                ", peso=" + peso +
                ", pregunta='" + pregunta + '\'' +
                ", tipoCampo='" + tipoCampo + '\'' +
                ", idTipoLicitacion=" + idTipoLicitacion +
                ", descripcionTipoLicitacion='" + descripcionTipoLicitacion + '\'' +
                ", idTipoCuestionario=" + idTipoCuestionario +
                ", descripcionTipoCuestionario='" + descripcionTipoCuestionario + '\'' +
                ", respuestaPredefinida='" + respuestaPredefinida + '\'' +
                ", usuarioCreacion='" + usuarioCreacion + '\'' +
                ", usuarioModificacion='" + usuarioModificacion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaModificacion=" + fechaModificacion +

                '}';
    }
}
