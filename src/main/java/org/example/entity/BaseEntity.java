package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @UuidGenerator
    private String id;

    @Column(name = "created_date")
    private LocalDateTime createdDate=LocalDateTime.now();

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "visible")
    private Boolean visible=Boolean.TRUE;

    @Column(name = "deleted_date")
    private LocalDateTime deletedDate;
}
