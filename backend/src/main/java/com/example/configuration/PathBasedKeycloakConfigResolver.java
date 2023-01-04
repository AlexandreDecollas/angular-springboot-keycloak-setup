package com.example.configuration;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.adapters.KeycloakDeploymentBuilder;
import org.keycloak.adapters.OIDCHttpFacade;

import java.io.InputStream;

public class PathBasedKeycloakConfigResolver implements KeycloakConfigResolver {

    @Override
    public KeycloakDeployment resolve(OIDCHttpFacade.Request request) {

        InputStream is = getClass().getResourceAsStream("/keycloak-localhost.json");
        return KeycloakDeploymentBuilder.build(is);
    }
}
