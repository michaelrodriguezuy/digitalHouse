package com.dh.supplier_data_service.repository;

import com.dh.supplier_data_service.model.SupplierDTO;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class KeyCloakRespository implements ISupplierRepository {

    @Autowired
    private Keycloak keycloak;

    @Value("${dh.keycloak.realm}")
    private String realm;

    @Override
    public Optional<SupplierDTO> findById(String id) {
        UserRepresentation userRepresentation = keycloak
                .realm(realm)
                .users()
                .get(id)
                .toRepresentation();
        return Optional.of(fromRepresentation(userRepresentation));
    }

    //en lugar de solicitar los usuarios del reino, pregunto por los miembros de un grupo en particular
    @Override
    public List<SupplierDTO> findByUsername (String username) {
        List<UserRepresentation> userRepresentations = keycloak
                .realm(realm)
                .groups().group(keycloak.realm(realm)
                       .getGroupByPath("conflictivo").getId()
                )
                .members();
        return userRepresentations.stream().map(user -> user.getUsername().equals(username)? fromRepresentation(user): null).filter(e->e!=null).collect(Collectors.toList());
    }

    private SupplierDTO fromRepresentation(UserRepresentation userRepresentation){
        return new SupplierDTO(userRepresentation.getId(), userRepresentation.getFirstName(), userRepresentation.getLastName());
    }

}
