package br.edu.imepac.folhapagamento.controllers;

import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorCreateRequest;
import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorDTO;
import br.edu.imepac.folhapagamento.services.CollaboratorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/collaborator")
public class CollaboratorController {

    private final CollaboratorService collaboratorService;

    public CollaboratorController(CollaboratorService collaboratorService) {
        this.collaboratorService = collaboratorService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public CollaboratorDTO addCollaborator(@RequestBody @Valid CollaboratorCreateRequest collaboratorCreateRequest) {
        return collaboratorService.save(collaboratorCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<CollaboratorDTO> getAllCollaborator() {
        return collaboratorService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CollaboratorDTO getCollaboratorById(@PathVariable("id") Long id) {
        return collaboratorService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCollaborator(@PathVariable("id") Long id) {
        collaboratorService.delete(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public CollaboratorDTO updateCollaborator(@PathVariable("id") Long id, @RequestBody @Valid CollaboratorCreateRequest collaboratorCreateRequest) {
      return collaboratorService.update(id, collaboratorCreateRequest);
    }

}
