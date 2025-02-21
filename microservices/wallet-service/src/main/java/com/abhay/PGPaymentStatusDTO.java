package com.abhay;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PGPaymentStatusDTO {
    private String status;
    private Long userId;
    private Double amount;
}