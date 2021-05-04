package com.epam.infra;

import lombok.*;

import java.util.Map;


@Data
@Builder
@AllArgsConstructor

public class JavaConfig implements Config {

    @Getter
    private String packagesToScan;

    private Map<Class,Class> ifc2ImplClasses;

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2ImplClasses.get(type);
    }
}
