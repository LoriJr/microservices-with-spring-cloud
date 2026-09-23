package com.viratech.dto;

public record PersonResponse(
        Long id,
        String firstName,
        String lastName,
        String address,
        String gender
) {
}
