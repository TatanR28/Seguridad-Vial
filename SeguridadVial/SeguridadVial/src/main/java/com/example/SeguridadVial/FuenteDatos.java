package com.example.SeguridadVial; 

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "datos.fuente")
public class FuenteDatos {

    private String nombre;
    private String entidad;
    private String periodo;
    private String url;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEntidad() { return entidad; }
    public void setEntidad(String entidad) { this.entidad = entidad; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
