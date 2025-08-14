package com.bashverse.logverse.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogCreateRequest {
    private String message;
    private String level;
}
