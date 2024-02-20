package com.moderntony.customer;

public record CustomerReqistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
