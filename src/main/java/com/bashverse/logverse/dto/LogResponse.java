package com.bashverse.logverse.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogResponse {
    private Long id;
    private String message;
    private String level;
    private Long timestamp;
}
