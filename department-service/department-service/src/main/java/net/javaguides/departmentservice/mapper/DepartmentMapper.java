package net.javaguides.departmentservice.mapper;

import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    @Mapping(source = "id", target = "id")
    DepartmentDto entityToModel(Department entity);

    @Mapping(source = "id", target = "id")
    Department modelToEntity(DepartmentDto departmentDto);
}
