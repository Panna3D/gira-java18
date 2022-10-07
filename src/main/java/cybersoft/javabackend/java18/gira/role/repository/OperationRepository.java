package cybersoft.javabackend.java18.gira.role.repository;

import cybersoft.javabackend.java18.gira.role.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OperationRepository extends JpaRepository<Operation, UUID> {
}
