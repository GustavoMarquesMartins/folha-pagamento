package br.edu.imepac.folhapagamento.services;

import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorCreateRequest;
import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorDTO;
import br.edu.imepac.folhapagamento.domains.teacher.TeacherCreateRequest;
import br.edu.imepac.folhapagamento.domains.teacher.TeacherDTO;
import br.edu.imepac.folhapagamento.entities.Collaborator;
import br.edu.imepac.folhapagamento.entities.Teacher;
import br.edu.imepac.folhapagamento.repositories.CollaboratorRepository;
import br.edu.imepac.folhapagamento.repositories.TeacherRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Data
public class CollaboratorService {

    private final CollaboratorRepository collaboratorRepository;
    private final ModelMapper modelMapper;

    public CollaboratorService(CollaboratorRepository collaboratorRepository, ModelMapper modelMapper) {
        this.collaboratorRepository = collaboratorRepository;
        this.modelMapper = modelMapper;
    }

    public CollaboratorDTO save(CollaboratorCreateRequest collaboratorCreateRequest) {
        Collaborator collaborator = modelMapper.map(collaboratorCreateRequest, Collaborator.class);
        collaborator = collaboratorRepository.save(collaborator);
        return modelMapper.map(collaborator, CollaboratorDTO.class);
    }

    public List<CollaboratorDTO> findAll() {
        List<Collaborator> collaborators = collaboratorRepository.findAll();
        return Arrays.asList(modelMapper.map(collaborators, CollaboratorDTO[].class));
    }

    public void delete(Long id){
        collaboratorRepository.deleteById(id);
    }

    public CollaboratorDTO findById(Long id) {
        return modelMapper.map(collaboratorRepository.getReferenceById(id), CollaboratorDTO.class);
    }
}
