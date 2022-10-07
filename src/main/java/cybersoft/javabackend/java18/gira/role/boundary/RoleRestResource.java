package cybersoft.javabackend.java18.gira.role.boundary;

import cybersoft.javabackend.java18.gira.common.util.ResponseUtils;
import cybersoft.javabackend.java18.gira.role.dto.RoleDTO;
import cybersoft.javabackend.java18.gira.role.service.RoleService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/roles")
public class RoleRestResource {

    private final RoleService service;

    public RoleRestResource(RoleService roleService) {
        this.service = roleService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseUtils.get(service.findAll(), HttpStatus.OK); // Generic
    }


    @GetMapping("/paging")
    public ResponseEntity<?> findAllDtoPaging(@RequestParam("size") int size,
                                            @RequestParam("index") int index) {
        return ResponseUtils.get(
                        service.findAllDto( // Generic
                                Pageable.ofSize(size).withPage(index),
                                RoleDTO.class),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid RoleDTO roleDTO) {
        return ResponseUtils.get(service.save(roleDTO), HttpStatus.OK); // service
    }

    @PostMapping("{role-id}/add-operations")
    public ResponseEntity<?> addOperations(@RequestBody List<UUID> ids,
                                            @PathVariable("role-id") UUID roleId){
        return ResponseUtils.get(
                service.addOperations(roleId, ids) // service
                , HttpStatus.OK
        );
    }


}
