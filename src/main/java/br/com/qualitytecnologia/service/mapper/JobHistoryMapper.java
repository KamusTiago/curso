package br.com.qualitytecnologia.service.mapper;

import br.com.qualitytecnologia.domain.*;
import br.com.qualitytecnologia.service.dto.JobHistoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link JobHistory} and its DTO {@link JobHistoryDTO}.
 */
@Mapper(componentModel = "spring", uses = { JobMapper.class, DepartmentMapper.class, EmployeeMapper.class })
public interface JobHistoryMapper extends EntityMapper<JobHistoryDTO, JobHistory> {
    @Mapping(target = "job", source = "job", qualifiedByName = "id")
    @Mapping(target = "department", source = "department", qualifiedByName = "id")
    @Mapping(target = "employee", source = "employee", qualifiedByName = "id")
    JobHistoryDTO toDto(JobHistory s);
}
