package ru.yandex.practicum.javafilmorate.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class Film {

    @EqualsAndHashCode.Exclude
    private long id;
    @NotNull
    @NotBlank
    private String name;
    @Size(max = 200, message = "Длина описания не должна превышать 200 символов")
    private String description;
    private LocalDate releaseDate;
    private Duration duration;
    private Set<Long> likes;
    private int likesAmount;
}
