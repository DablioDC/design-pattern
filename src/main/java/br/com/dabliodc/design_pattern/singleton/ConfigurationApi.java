package br.com.dabliodc.design_pattern.singleton;

import java.util.Objects;

public class ConfigurationApi {

    private static ConfigurationApi instante;

    private ConfigurationApi(){
    }

    public static ConfigurationApi getInstance() {
        synchronized (ConfigurationApi.class) {
            if (Objects.isNull(instante)) {
                instante = new ConfigurationApi();
            }
        }
        return instante;
    }
}
