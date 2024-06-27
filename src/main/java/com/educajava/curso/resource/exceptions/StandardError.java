package com.educajava.curso.resource.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.time.Instant;
@Getter
@Setter
@ToString
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd' T 'HH:mm:s", timezone = "GMT")
    private Instant timeStamp;
    private Integer status;
    private String  error;
    private String message;
    private String path;

    public StandardError() {}

    public StandardError(Instant timeStamp, Integer status, String error, String message, String path) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

}
