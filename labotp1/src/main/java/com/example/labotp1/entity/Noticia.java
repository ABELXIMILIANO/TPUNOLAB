package com.example.labotp1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Noticia")
@Entity
public class Noticia {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tituloNoticia;

    @Column
    private String resumenNoticia;

    @Column
    private String imagenNoticia;

    @Column
    private String contenidoHTML;

    @Column
    private boolean Publicada;

    @Column
    private Date fecha;

    @ManyToOne
    @JsonIgnore
    @JoinColumn (name = "empresa_id")
    private Empresa empresa= null;

    @Column(name = "empresa_id",insertable=false, updatable=false)
    private Long empresaId;


}
