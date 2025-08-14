package com.bashverse.logverse.mapper;

import com.bashverse.logverse.dto.LogCreateRequest;
import com.bashverse.logverse.dto.LogResponse;
import com.bashverse.logverse.entity.LogEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LogMapper {

    LogMapper INSTANCE = Mappers.getMapper(LogMapper.class);

    // Map Entity → Response DTO
    LogResponse toDto(LogEntity entity);

    // Map Create Request → Entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "timestamp", ignore = true) // Handled in service
    LogEntity toEntity(LogCreateRequest request);
}
