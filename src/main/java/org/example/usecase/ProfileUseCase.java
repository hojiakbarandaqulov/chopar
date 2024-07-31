package org.example.usecase;

import org.example.dto.ApiResponse;

public interface ProfileUseCase<REQUEST, RESPONSE> {
    ApiResponse<String> createProfile(REQUEST request);

    ApiResponse<String> updateProfile(REQUEST request);

    ApiResponse<String> deleteProfile(REQUEST request);

    ApiResponse<RESPONSE> getProfile(REQUEST request);
}
