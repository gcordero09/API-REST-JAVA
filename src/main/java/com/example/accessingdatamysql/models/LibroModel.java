package com.example.accessingdatamysql.models;

import jakarta.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "libros")
public class LibroModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "editorial")
    private String editorial;
    @Column(name = "area")
    private String area;
    @Column(name = "cover_url")
    private String coverUrl;
    @Column(name = "digital_url")
    private String digitalUrl;
    @Column(name = "disponible_fisico")
    private boolean isDisponibleFisico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getDigitalUrl() {
        return digitalUrl;
    }

    public void setDigitalUrl(String digitalUrl) {
        this.digitalUrl = digitalUrl;
    }

    public boolean isDisponibleFisico() {
        return isDisponibleFisico;
    }

    public void setDisponibleFisico(boolean disponibleFisico) {
        isDisponibleFisico = disponibleFisico;
    }
}