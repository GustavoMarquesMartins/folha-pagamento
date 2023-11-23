package br.edu.imepac.folhapagamento.controllers;

import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorCreateRequest;
import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorDTO;
import br.edu.imepac.folhapagamento.domains.teacher.TeacherCreateRequest;
import br.edu.imepac.folhapagamento.domains.teacher.TeacherDTO;
import br.edu.imepac.folhapagamento.entities.Teacher;
import br.edu.imepac.folhapagamento.services.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public TeacherDTO addTeacher(@RequestBody TeacherCreateRequest teacherCreateRequest) {
        return teacherService.save(teacherCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<TeacherDTO> getAllTeacher() {
        return teacherService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public TeacherDTO getTeacherById(@PathVariable("id") Long id) {
        return teacherService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
    public void deleteTeacher(@PathVariable("id") Long id) {
        teacherService.delete(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public TeacherDTO updateCollaborator(@PathVariable("id") Long id, @RequestBody @Valid TeacherCreateRequest teacherCreateRequest) {
        return teacherService.update(id, teacherCreateRequest);
    }
}
