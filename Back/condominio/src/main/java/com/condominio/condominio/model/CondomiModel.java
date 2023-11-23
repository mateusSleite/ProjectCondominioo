package main.java.com.condominio.condominio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("morador")
public class CondomiModel {
    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String bloco;

    @Getter
    @Setter
    private String apto;

    @Getter
    @Setter
    private Boolean ativo ;

    public CondomiModel() { }

    public CondomiModel(String id) {
        this.id = id;
    }

    public CondomiModel(String bloco, String apto, Boolean ativo) {
        this.bloco = bloco;
        this.apto = apto;
        this.ativo = ativo;
    }
}
