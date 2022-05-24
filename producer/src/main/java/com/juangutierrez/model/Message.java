package com.juangutierrez.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Message {

    private String author;

    private String text;
}
