package org.example.service;

import org.example.dto.ApiResponse;
import org.example.dto.record.ProfileRequest;
import org.example.dto.record.ProfileResponse;
import org.example.entity.ProfileEntity;
import org.example.repository.ProfileRepository;
import org.example.usecase.ProfileUseCase;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service

public class ProfileService implements ProfileUseCase<ProfileRequest, ProfileResponse> {
    private ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public ApiResponse<String> createProfile(ProfileRequest profileRequest) {
//        var entity = ProfileEntity;
        return null;
    }

    @Override
    public ApiResponse<String> updateProfile(ProfileRequest profileRequest) {
        return null;
    }

    @Override
    public ApiResponse<String> deleteProfile(ProfileRequest profileRequest) {
        return null;
    }

    @Override
    public ApiResponse<ProfileResponse> getProfile(ProfileRequest profileRequest) {
        return null;
    }
}
