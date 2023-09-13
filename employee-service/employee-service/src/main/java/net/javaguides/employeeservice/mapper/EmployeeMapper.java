package net.javaguides.employeeservice.mapper;


import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "id", target = "id")
    EmployeeDto entityToModel(Employee entity);

    @Mapping(source = "id", target = "id")
    Employee modelToEntity(EmployeeDto departmentDto);
}
