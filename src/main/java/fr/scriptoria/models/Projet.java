package fr.scriptoria.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Id;

public class Projet {
    @Id
    private String id;
    private String titre;
    private String sousTitre;
    //private Type type;
    private String description;
    private LocalDateTime dateCreation;
    private List<String> livres;
    private List<String> notes;
    private List<String> inspirations;
    private List<String> personnages;

}
