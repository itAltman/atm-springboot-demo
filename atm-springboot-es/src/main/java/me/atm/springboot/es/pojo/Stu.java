package me.atm.springboot.es.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Data
@Document(indexName = "stu")
public class Stu {
    @Id
    private Long stuId;
    @Field(store = true)
    private String name;
    @Field(store = true)
    private Integer age;

}
