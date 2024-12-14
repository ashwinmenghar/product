package dev.ashwin.productservicettsevening.inheritanceexamples.singleclass;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity(name = "st_instructor")
@DiscriminatorValue("2")
public class Instructor extends User {
    private boolean isHandsome;
}