package br.edu.imepac.folhapagamento.services;

import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorCreateRequest;
import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorDTO;
import br.edu.imepac.folhapagamento.domains.teacher.TeacherCreateRequest;
import br.edu.imepac.folhapagamento.domains.teacher.TeacherDTO;
import br.edu.imepac.folhapagamento.entities.Teacher;
import br.edu.imepac.folhapagamento.repositories.TeacherRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Data
public class TeacherService {

    private final TeacherRepository teacherRepository;
    private final ModelMapper modelMapper;

    public TeacherService(TeacherRepository teacherRepository, ModelMapper modelMapper) {
        this.teacherRepository = teacherRepository;
        this.modelMapper = modelMapper;
    }

    public TeacherDTO save(TeacherCreateRequest teacherCreateRequest) {
        Teacher teacher = modelMapper.map(teacherCreateRequest, Teacher.class);
        teacher = teacherRepository.save(teacher);
        return modelMapper.map(teacher, TeacherDTO.class);
    }

    public List<TeacherDTO> findAll() {
        List<Teacher> teachers = teacherRepository.findAll();
        return Arrays.asList(modelMapper.map(teachers, TeacherDTO[].class));
    }

    public void delete(Long id){
        teacherRepository.deleteById(id);
    }

    public TeacherDTO findById(Long id) {
        return modelMapper.map(teacherRepository.getReferenceById(id), TeacherDTO.class);
    }

    @Transactional
    public TeacherDTO update(Long id, TeacherCreateRequest teacher) {
        var teacherFound = this.teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("Colaborador não foi encontrado."));
        teacherFound.update(teacher);
        return modelMapper.map(teacherFound,TeacherDTO.class);
    }
}
