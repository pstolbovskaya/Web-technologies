package by.ilyacoding.servicehotels.locale;

import java.util.ResourceBundle;

public enum LocalePropertyManager {
    INSTANCE;

    private final ResourceBundle bundle = ResourceBundle.getBundle("locale");

    public String getProperty(String key){
        return bundle.getString(key);
    }
}
